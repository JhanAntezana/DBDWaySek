package com.waySek.restauranteBE.persistence.crud;

import com.waySek.restauranteBE.persistence.entity.Order;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrderCrudRepository extends CrudRepository<Order, Integer> {
    @Query(value = "insert into ordenes (idMesa,idUsuarioAtencion,turno,fechaCreacion,correlativoDiario) " +
            "values (?1,?2,?3,current_timestamp,?4)",nativeQuery = true)
    Order registerOrder(int tableId,int userId,String turn,int correlative);
}
