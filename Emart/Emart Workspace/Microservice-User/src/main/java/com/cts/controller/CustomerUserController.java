package com.cts.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Customer;
import com.cts.entity.EmartUsers;
import com.cts.service.CustomerUserService;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerUserController {

	@Autowired
	CustomerUserService service;

	@RequestMapping("/")
	Iterable<Customer> getAllCustomers() {
		return service.getAllCustomers();
	}
	
	@RequestMapping("/{customerId}")
	Optional<Customer> getCustomerById(@PathVariable Integer customerId) {
		return service.getCustomerById(customerId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/signup")
	void addCustomer(@RequestBody Customer customer) {
		customer.setCreatedDate(new Date().toString());
		service.addCustomer(customer);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{customerId}")
	void updateCustomer(@RequestBody Customer customer, @PathVariable Integer customerId) {
		service.updateCustomer(customer);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{customerId}")
	void deleteCustomer(@PathVariable Integer customerId) {
		service.deleteCustomer(customerId);
	}
}
