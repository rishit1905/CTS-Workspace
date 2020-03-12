package com.cts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Customer;
import com.cts.entity.Seller;
import com.cts.repo.SellerUserRepository;

@Service
public class SellerUserService {

	@Autowired
	SellerUserRepository repo;
	
	public void updateSeller(Seller seller) {
		 repo.save(seller);
	}

	public void deleteSeller(Integer sellerId) {
		repo.deleteById(sellerId);
		
	}

	public Iterable<Seller> getAllSellers() {
		return repo.findAll();
	}

	public void addSeller(Seller seller) {
		repo.save(seller);
		
	}

	public Optional<Seller> getSellerById(Integer sellerId) {
		return repo.findById(sellerId);
	}

}
