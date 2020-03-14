package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Payment;
import com.cts.service.PaymentService;



@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/payments")
public class PaymentController {
	
	@Autowired
	PaymentService service;

	@RequestMapping("/payments")
	List<Payment> getAllUsers() {
		return service.getAllTransactions();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/payments")
	void addPayment(@RequestBody Payment payment) {
		service.addPayment(payment);
	}
	
	@RequestMapping("/users/payments/{cvv}")
	Optional<Payment> getUserDetailsById(@PathVariable int cvv) {
		return service.getUserDetailsById(cvv);
	}
}
