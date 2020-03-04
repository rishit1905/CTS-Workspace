package com.cts.emart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.entity.EmartUsers;
import com.cts.emart.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;

	public List<EmartUsers> getAllUsers() {
		return (List<EmartUsers>)repo.findAll();
	}

	public void addUsers(EmartUsers user) {
		repo.save(user);
		
	}
}
