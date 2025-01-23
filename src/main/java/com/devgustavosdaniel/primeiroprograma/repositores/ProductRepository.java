package com.devgustavosdaniel.primeiroprograma.repositores;

import com.devgustavosdaniel.primeiroprograma.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

	

}
