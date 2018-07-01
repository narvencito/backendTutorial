package com.practica.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.demo.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@SuppressWarnings("unchecked")
	User save(User user);
}
