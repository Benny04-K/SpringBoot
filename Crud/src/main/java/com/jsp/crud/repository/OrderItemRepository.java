package com.jsp.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.crud.dao.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
   
}
