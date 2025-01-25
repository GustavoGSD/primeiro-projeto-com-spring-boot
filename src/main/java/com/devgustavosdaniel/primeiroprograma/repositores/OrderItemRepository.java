package com.devgustavosdaniel.primeiroprograma.repositores;

import com.devgustavosdaniel.primeiroprograma.entities.OrderItem;
import com.devgustavosdaniel.primeiroprograma.entities.pk.OrderItemPK;

import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK > {

	

}
