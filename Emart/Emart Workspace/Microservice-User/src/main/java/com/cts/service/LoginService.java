package com.cts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cts.entity.EmartUsers;
import com.cts.repo.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository repo;

	public Iterable<EmartUsers> getAllUsers() {
		return repo.findAll();
	}

	public EmartUsers searchByUserName(String userName, String password) {
		return repo.findByUserName(userName, password);
	}

	public Optional<EmartUsers> getUserDetailsById(Integer id) {
		return repo.findById(id);
	}
}
