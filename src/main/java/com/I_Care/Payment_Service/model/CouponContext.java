package com.I_Care.Payment_Service.model;

import com.I_Care.Payment_Service.enums.PaymentType;

import java.util.ArrayList;
import java.util.List;

public class CouponContext {
    public Order order;
    public PaymentType paymentType;
    public List<Coupon> appliedCoupon = new ArrayList<>();

}
