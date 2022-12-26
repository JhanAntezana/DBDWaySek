package com.waySek.restauranteBE.persistence.crud;

import com.waySek.restauranteBE.persistence.entity.OrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailCrudRepository extends CrudRepository<OrderDetail, Integer> {
}
