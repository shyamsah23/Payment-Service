package com.I_Care.Payment_Service.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table( name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double totalAmount;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> items;

    public Order() {
    }

    public Order(Long id, double totalAmount, List<OrderItem> items) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
