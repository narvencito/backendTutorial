package com.practica.demo.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.practica.demo.dao.service.UserService;
import com.practica.demo.models.User;
import com.practica.demo.util.RestResponse;

@RestController
public class UserController {
	
	@Autowired
	protected UserService userService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value="/saveOrUpdate",method=RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson) throws JsonParseException, JsonMappingException, IOException {
		this.mapper=new ObjectMapper();
		
		User user=this.mapper.readValue(userJson, User.class);
		
		if(!this.validate(user)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),"los Campos Obligatorios tienen que ser llenados");
		}
		
		this.userService.save(user);
		return new RestResponse(HttpStatus.OK.value(), "Operacion Exitosa!!!");
	}
	private boolean validate(User user) {
		
		boolean isValid=true;
		
		if(user.getFirst_name()=="" || user.getFirst_name()==null) {
			isValid=false;
		}
		
		if(user.getFirst_surname()=="" || user.getFirst_surname()==null) {
			isValid=false;
		}
		if(user.getSecond_surname()=="" || user.getSecond_surname()==null) {
			isValid=false;
		}
		if(user.getAddress()=="" || user.getAddress()==null) {
			isValid=false;
		}
		
		return isValid;
	}

}
