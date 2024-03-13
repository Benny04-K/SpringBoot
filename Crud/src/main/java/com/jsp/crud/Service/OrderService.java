package com.jsp.crud.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.crud.dao.Order;
import com.jsp.crud.dao.OrderItem;
import com.jsp.crud.repository.OrderItemRepository;
import com.jsp.crud.repository.OrderRepository;  


@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    public Order createOrder(Order order, List<OrderItem> orderItems) {
        Order createdOrder = orderRepository.save(order);

        for (OrderItem orderItem : orderItems) {
            orderItem.setOrder(createdOrder);
            orderItemRepository.save(orderItem);
        }

        return createdOrder;
    }

    public Order updateOrder(Long orderId, Order updatedOrder) {
        Order existingOrder = orderRepository.findById(orderId).orElse(null);

        if (existingOrder != null) {
       
            return orderRepository.save(existingOrder);
        }

        return null;
    }

    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}


