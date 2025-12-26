package com.I_Care.Payment_Service.rule;

import java.util.List;

public class RuleFactory {
    public List<CouponRule> buildRules() {
        return List.of(
                new CategoryRule(), new PaymentMethodRule(), new StackRule()
        );
    }
}
