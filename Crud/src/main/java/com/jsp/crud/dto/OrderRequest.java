package com.jsp.crud.dto;

import java.util.List;

import com.jsp.crud.dao.Order;
import com.jsp.crud.dao.OrderItem;

import lombok.Data;
@Data
public class OrderRequest {
    private Order order;
    private List<OrderItem> orderItems;
}
