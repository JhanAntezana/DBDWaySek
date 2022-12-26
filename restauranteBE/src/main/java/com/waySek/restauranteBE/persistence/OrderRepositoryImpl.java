package com.waySek.restauranteBE.persistence;

import com.waySek.restauranteBE.domain.repository.OrderRepository;
import com.waySek.restauranteBE.persistence.crud.OrderCrudRepository;
import com.waySek.restauranteBE.persistence.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    @Autowired
    OrderCrudRepository orderCrudRepository;
    @Override
    public Order takeOrder(Order order) {
        orderCrudRepository.registerOrder(order.getTableId(),order.getAttentionUserId(),order.getTurn(),order.getDailyCorrelative());
        return order;
    }

    @Override
    public List<Order> getOrders() {
        return (List<Order>) orderCrudRepository.findAll();
    }
}
