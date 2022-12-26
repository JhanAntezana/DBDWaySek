package com.waySek.restauranteBE.domain.service;

import com.waySek.restauranteBE.persistence.OrderRepositoryImpl;
import com.waySek.restauranteBE.persistence.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepositoryImpl orderRepository;
    public Order takeOrder(Order order) {
        orderRepository.takeOrder(order);
        return order;
    }
    public List<Order> getOrders() {
        return orderRepository.getOrders();
    }
}
