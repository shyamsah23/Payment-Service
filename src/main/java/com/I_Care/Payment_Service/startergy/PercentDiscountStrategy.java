package com.I_Care.Payment_Service.startergy;

public class PercentDiscountStrategy implements DiscountStrategy{
    private final double percent;
    private final double max;

    public PercentDiscountStrategy(double percent, double max) {
        this.percent = percent;
        this.max = max;
    }

    @Override
    public double calculate(double amount) {
        return Math.max(amount*percent/100 , max);
    }
}
