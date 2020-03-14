package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Payment;
import com.cts.repo.PaymentRepository;



@Service
public class PaymentService {
	Payment payment;
	@Autowired
	PaymentRepository repo;
	public List<Payment> getAllTransactions() {
		// TODO Auto-generated method stub
		return (List<Payment>) repo.findAll();
	}


	public void addPayment(Payment payment) {
		repo.save(payment);
		
	}

	public Optional<Payment> getUserDetailsById(int cvv) {
		
		return repo.findById(cvv);
	}

}
