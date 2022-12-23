package com.waySek.restauranteBE.domain.repository;

import com.waySek.restauranteBE.persistence.entity.Menu;

import java.util.List;

public interface MenuRepository {
    List<Menu> getAll();
}
