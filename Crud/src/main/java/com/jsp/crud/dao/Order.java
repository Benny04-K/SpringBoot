package com.jsp.crud.dao;




import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "Order_id")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Product_name", nullable = false)
    private String name;
    @Column(name = "Product_price", nullable = false)
    private double price;
    @OneToMany(mappedBy = "order")
    private Set<OrderItem> orderItems;
    
}
