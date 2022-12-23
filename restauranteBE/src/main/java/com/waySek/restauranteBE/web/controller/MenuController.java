package com.waySek.restauranteBE.web.controller;

import com.waySek.restauranteBE.domain.service.MenuService;
import com.waySek.restauranteBE.persistence.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("menu")
public class MenuController {
    @Autowired
    private MenuService menuService;
    @GetMapping("/all")
    public List<Menu> getAll(){
        return menuService.getAll();
    }
}
