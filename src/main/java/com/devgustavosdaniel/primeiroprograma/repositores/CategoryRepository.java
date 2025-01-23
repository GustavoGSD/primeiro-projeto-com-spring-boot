package com.devgustavosdaniel.primeiroprograma.repositores;

import com.devgustavosdaniel.primeiroprograma.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

	

}
