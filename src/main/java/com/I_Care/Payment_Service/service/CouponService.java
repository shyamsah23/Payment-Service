package com.I_Care.Payment_Service.service;

import com.I_Care.Payment_Service.DTO.ApplyCouponRequest;

public interface CouponService {

    double applyCoupon (ApplyCouponRequest request);
}
