package com.devgustavosdaniel.primeiroprograma.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devgustavosdaniel.primeiroprograma.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
