package com.I_Care.Payment_Service.startergy;

import com.I_Care.Payment_Service.model.Coupon;

public class DiscountStrategyFactory {

    public DiscountStrategy getStrategy(Coupon coupon) {
        return switch (coupon.getDiscountType()) {
                    case FLAT -> new FlatDiscountStrategy(coupon.getDiscountValue());
                    case PERCENT -> new PercentDiscountStrategy(coupon.getDiscountValue(),coupon.getMaxDiscount());
                };
    }
}
