package com.devgustavosdaniel.primeiroprograma.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devgustavosdaniel.primeiroprograma.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
