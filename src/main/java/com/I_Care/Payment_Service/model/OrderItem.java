package com.I_Care.Payment_Service.model;

import jakarta.persistence.*;

@Entity
@Table( name = "Order_Items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double price;
    private String category;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public OrderItem(Long id, double price, String category , Order order) {
        this.id = id;
        this.price = price;
        this.category = category;
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
