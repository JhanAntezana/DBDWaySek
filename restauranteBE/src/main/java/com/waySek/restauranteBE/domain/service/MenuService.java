package com.waySek.restauranteBE.domain.service;

import com.waySek.restauranteBE.domain.repository.MenuRepository;
import com.waySek.restauranteBE.persistence.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;
    public List<Menu> getAll(){
        return menuRepository.getAll();
    }
}
