package com.practica.demo.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.demo.dao.UserRepository;
import com.practica.demo.models.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {
		
		return this.userRepository.save(user);
	}

}
