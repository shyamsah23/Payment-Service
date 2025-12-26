package com.I_Care.Payment_Service.repository;

import com.I_Care.Payment_Service.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon ,Long> {

    Coupon findByCode(String code);
}
