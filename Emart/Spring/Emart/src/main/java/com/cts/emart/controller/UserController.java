package com.cts.emart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.entity.EmartUsers;
import com.cts.emart.service.UserService;

@RestController
public class UserController {
		
		@Autowired
		UserService service;
		
		@RequestMapping("/users")
		List<EmartUsers> getAllUsers() {
		return service.getAllUsers();
		}
		
		@RequestMapping(method = RequestMethod.POST, value = "/users")
		void addUsers(@RequestBody EmartUsers user) {
			service.addUsers(user);
		}
}
