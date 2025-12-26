package com.I_Care.Payment_Service.service;

import com.I_Care.Payment_Service.DTO.ApplyCouponRequest;
import com.I_Care.Payment_Service.exception.CouponNotFoundException;
import com.I_Care.Payment_Service.exception.OrderNotFoundException;
import com.I_Care.Payment_Service.model.Coupon;
import com.I_Care.Payment_Service.model.CouponContext;
import com.I_Care.Payment_Service.model.Order;
import com.I_Care.Payment_Service.repository.CouponRepository;
import com.I_Care.Payment_Service.repository.OrderRepository;
import com.I_Care.Payment_Service.rule.RuleFactory;
import com.I_Care.Payment_Service.startergy.DiscountStrategy;
import com.I_Care.Payment_Service.startergy.DiscountStrategyFactory;
import com.I_Care.Payment_Service.validator.CouponValidator;
import org.springframework.beans.factory.annotation.Autowired;

public class CouponServiceImpl implements CouponService {

    private final OrderRepository orderRepository;
    private final CouponRepository couponRepository;

    private final CouponValidator couponValidator = new CouponValidator();
    private final RuleFactory ruleFactory = new RuleFactory();
    private final DiscountStrategyFactory discountStrategyFactory = new DiscountStrategyFactory();

    public CouponServiceImpl(OrderRepository orderRepository, CouponRepository couponRepository) {
        this.orderRepository = orderRepository;
        this.couponRepository = couponRepository;
    }

    public double applyCoupon(ApplyCouponRequest request) {
        Order order = orderRepository.findById(request.getOrderId()).
                orElseThrow(() -> new OrderNotFoundException("No Order Found!"));
        Coupon coupon = couponRepository.findByCode(request.getCouponCode()).
                orElseThrow(() -> new CouponNotFoundException("Invalid Coupon"));

        CouponContext couponContext = new CouponContext();
        couponContext.setOrder(order);
        couponContext.setPaymentType(request.getPaymentType());

        // Validations
        couponValidator.validate(ruleFactory.buildRules(),couponContext,coupon);

        DiscountStrategy strategy = discountStrategyFactory.getStrategy(coupon);
        return strategy.calculate(order.getTotalAmount());
        
    }
}
