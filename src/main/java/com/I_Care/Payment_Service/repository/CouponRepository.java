package com.I_Care.Payment_Service.repository;

import com.I_Care.Payment_Service.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CouponRepository extends JpaRepository<Coupon ,Long> {

    Optional<Coupon> findByCode(String code);
}
