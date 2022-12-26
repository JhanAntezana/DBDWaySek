package com.waySek.restauranteBE.persistence.crud;

import com.waySek.restauranteBE.persistence.entity.AtentionTable;
import org.springframework.data.repository.CrudRepository;

public interface TableCrudRepository extends CrudRepository<AtentionTable,Integer> {
}
