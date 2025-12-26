package com.I_Care.Payment_Service.controller;

import com.I_Care.Payment_Service.DTO.ApplyCouponRequest;
import com.I_Care.Payment_Service.service.CouponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment/coupon")
public class CouponController {

    Logger log = LoggerFactory.getLogger(CouponController.class);

    private final CouponService couponService;

    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }

    @PostMapping("/apply")
    public ResponseEntity<Double> applyCoupon(@RequestBody ApplyCouponRequest request) {
        log.info("Started Applying Coupon For Order Id = {} with Coupon Code = {}", request.getOrderId(), request.getCouponCode());
        Double finalPrice = couponService.applyCoupon(request);
        log.info("Coupon Applied Successfully");
        return new ResponseEntity<>(finalPrice, HttpStatus.OK);
    }
}
