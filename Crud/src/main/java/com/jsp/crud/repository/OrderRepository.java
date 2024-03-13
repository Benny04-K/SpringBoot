package com.jsp.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.crud.dao.Order;


public interface OrderRepository extends JpaRepository<Order,Long>
{
}
