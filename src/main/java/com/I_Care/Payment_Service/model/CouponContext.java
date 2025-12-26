package com.I_Care.Payment_Service.model;

import com.I_Care.Payment_Service.enums.PaymentType;

import java.util.ArrayList;
import java.util.List;

public class CouponContext {
    public Order order;
    public PaymentType paymentType;
    public List<Coupon> appliedCoupon = new ArrayList<>();

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public List<Coupon> getAppliedCoupon() {
        return appliedCoupon;
    }

    public void setAppliedCoupon(List<Coupon> appliedCoupon) {
        this.appliedCoupon = appliedCoupon;
    }
}
