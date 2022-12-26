package com.waySek.restauranteBE.domain.repository;

import com.waySek.restauranteBE.persistence.entity.OrderDetail;

import java.util.List;

public interface OrderDetailRepository {
    OrderDetail registerOrderDetail(OrderDetail orderDetail);
    List<OrderDetail> registerOrderDetail(List<OrderDetail> orderDetails);
}
