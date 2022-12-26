package com.waySek.restauranteBE.web.controller;

import com.waySek.restauranteBE.domain.service.OrderService;
import com.waySek.restauranteBE.persistence.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/takeOrder")
    public Order takeOrder(@RequestBody Order order) {
        orderService.takeOrder(order);
        return order;
    }
    @RequestMapping("/all")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }
}
