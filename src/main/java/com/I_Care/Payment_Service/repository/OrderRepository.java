package com.I_Care.Payment_Service.repository;

import com.I_Care.Payment_Service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
