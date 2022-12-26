package com.waySek.restauranteBE.domain.repository;

import com.waySek.restauranteBE.persistence.entity.Order;

import java.util.List;

public interface OrderRepository {
    Order takeOrder(Order order);
    List<Order> getOrders();
}
