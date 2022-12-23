package com.waySek.restauranteBE.persistence.crud;

import com.waySek.restauranteBE.persistence.entity.Menu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuCrudRepository extends CrudRepository<Menu,Integer> {
    List<Menu> findByMenuCategoryIdOrderByNameAsc(int CategoryId);
    @Query(value = "select * from menus where idCategoria = ?1 order by nombreMenu",nativeQuery = true)
    List<Menu> findByCategoryIdOrderByNameAsc(int CategoryId);

}
