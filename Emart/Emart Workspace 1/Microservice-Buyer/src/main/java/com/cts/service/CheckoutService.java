package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Product;
import com.cts.entity.PurchaseHistory;
import com.cts.repo.CheckoutRepository;

@Service
public class CheckoutService {

	@Autowired
	CheckoutRepository repo;

//
//	public PurchaseHistory checkout(Product product) {
//		repo.save(product);
//		
//	}


}
