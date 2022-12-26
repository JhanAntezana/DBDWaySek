package com.waySek.restauranteBE.persistence;

import com.waySek.restauranteBE.domain.repository.TableRepository;
import com.waySek.restauranteBE.persistence.crud.TableCrudRepository;
import com.waySek.restauranteBE.persistence.entity.AtentionTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TableRepositoryImpl implements TableRepository {
    @Autowired
    TableCrudRepository tableCrudRepository;
}
