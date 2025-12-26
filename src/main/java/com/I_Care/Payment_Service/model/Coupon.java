package com.I_Care.Payment_Service.model;

import com.I_Care.Payment_Service.enums.DiscountType;
import com.I_Care.Payment_Service.enums.PaymentType;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "coupons")
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    @Enumerated(EnumType.STRING)
    private DiscountType discountType;
    private double discountValue;
    private double maxDiscount;
    private boolean stackable;

    @ElementCollection
    private Set<String> allowedCategory;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<PaymentType> allowedPaymentMethods;

    public Coupon() {
    }

    public Coupon(Long id, String code, DiscountType discountType, double discountValue, double maxDiscount, boolean stackable, Set<String> allowedCategory, Set<PaymentType> allowedPaymentMethods) {
        this.id = id;
        this.code = code;
        this.discountType = discountType;
        this.discountValue = discountValue;
        this.maxDiscount = maxDiscount;
        this.stackable = stackable;
        this.allowedCategory = allowedCategory;
        this.allowedPaymentMethods = allowedPaymentMethods;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public void setDiscountType(DiscountType discountType) {
        this.discountType = discountType;
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }

    public double getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(double maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public boolean isStackable() {
        return stackable;
    }

    public void setStackable(boolean stackable) {
        this.stackable = stackable;
    }

    public Set<String> getAllowedCategory() {
        return allowedCategory;
    }

    public void setAllowedCategory(Set<String> allowedCategory) {
        this.allowedCategory = allowedCategory;
    }

    public Set<PaymentType> getAllowedPaymentMethods() {
        return allowedPaymentMethods;
    }

    public void setAllowedPaymentMethods(Set<PaymentType> allowedPaymentMethods) {
        this.allowedPaymentMethods = allowedPaymentMethods;
    }
}
