package com.cts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.EmartUsers;
import com.cts.entity.Seller;
import com.cts.service.LoginService;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService service;

	@RequestMapping("/")
	Iterable<EmartUsers> getAllUsers(){
		return service.getAllUsers();
	}
	
	@RequestMapping("/{userName}/{password}")
	EmartUsers searchByUsername(@PathVariable String userName, @PathVariable String password){
		return service.searchByUserName(userName, password);
	}
	
	@RequestMapping("/{id}")
	Optional<EmartUsers> getUserDetailsById(@PathVariable Integer id) {
		return service.getUserDetailsById(id);
	}
}
