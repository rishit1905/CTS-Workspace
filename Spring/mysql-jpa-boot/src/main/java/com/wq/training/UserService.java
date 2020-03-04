package com.wq.training;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;

	public List<User> getAllUsers() {
		
//		Get all the users with their details from the db
		return (List<User>)repo.findAll();
		
	}

	public void addUser(User user) {
		repo.save(user);
		
	}

	public Optional<User> getUserDetailsByID(int id) {
		
		return repo.findById(id);
	}

	public void updateUser(User user) {
		repo.save(user);
		
	}

	public void deleteUser(int id) {
		repo.deleteById(id);
		
	}

	public User getUserByAddress(String address) {
		
		return repo.findByAddress(address);
		
	}

}













