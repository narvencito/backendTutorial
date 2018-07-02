package com.practica.demo.dao.service;

import java.util.List;

import com.practica.demo.models.User;

public interface UserService {
	
	/**
	 * guarda un usario
	 * @param user
	 * @return un usuario
	 */
	User save(User user);

	/**
	 * metodo que regresa una lista de todos los usuarios registrados
	 * @return lista de usuarios
	 */
	List<User> findAll();

	
	/**
	 * se elimina el usuario con un id determinado
	 * @param id
	 */
	void deleteUser(Long id);

	

}
