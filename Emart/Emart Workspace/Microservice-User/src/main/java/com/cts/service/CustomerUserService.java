package com.cts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Customer;
import com.cts.repo.CustomerUserRepository;

@Service
public class CustomerUserService {

	@Autowired
	CustomerUserRepository repo;
	
	public void updateCustomer(Customer customer) {
		 repo.save(customer);
	}

	public void deleteCustomer(Integer customerId) {
		repo.deleteById(customerId);
		
	}

	public Iterable<Customer> getAllCustomers() {
		return repo.findAll();
	}

	public void addCustomer(Customer customer) {
		repo.save(customer);
		
	}

	public Optional<Customer> getCustomerById(Integer customerId) {
		return repo.findById(customerId);
	}

}
