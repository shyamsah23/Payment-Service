package com.I_Care.Payment_Service.startergy;

public class FlatDiscountStrategy implements DiscountStrategy{
    private final double amount;

    public FlatDiscountStrategy(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculate(double amount) {
        return amount;
    }
}
