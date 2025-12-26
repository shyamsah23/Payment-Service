package com.I_Care.Payment_Service.rule;

import com.I_Care.Payment_Service.model.Coupon;
import com.I_Care.Payment_Service.model.CouponContext;

public class StackRule implements CouponRule {

    @Override
    public boolean isSatisfied(CouponContext couponContext, Coupon coupon) {
        return coupon.isStackable() || couponContext.appliedCoupon.isEmpty();
    }
}
