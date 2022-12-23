package com.waySek.restauranteBE.persistence;

import com.waySek.restauranteBE.domain.repository.MenuRepository;
import com.waySek.restauranteBE.persistence.crud.MenuCrudRepository;
import com.waySek.restauranteBE.persistence.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MenuRepositoryImpl implements MenuRepository {
    @Autowired
    private MenuCrudRepository menuCrudRepository;
    @Override
    public List<Menu> getAll() {
        return (List<Menu>) menuCrudRepository.findAll();
    }

}
