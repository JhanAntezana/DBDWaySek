package com.waySek.restauranteBE.persistence;

import com.waySek.restauranteBE.domain.repository.OrderDetailRepository;
import com.waySek.restauranteBE.persistence.crud.OrderDetailCrudRepository;
import com.waySek.restauranteBE.persistence.entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDetailRepositoryImpl implements OrderDetailRepository {
    @Autowired
    OrderDetailCrudRepository orderDetailCrudRepository;
    @Override
    public OrderDetail registerOrderDetail(OrderDetail orderDetail) {
        return null;
    }

    @Override
    public List<OrderDetail> registerOrderDetail(List<OrderDetail> orderDetails) {
        return null;
    }
}
