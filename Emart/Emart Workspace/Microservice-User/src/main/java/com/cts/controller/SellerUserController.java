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
import com.cts.entity.Seller;
import com.cts.service.SellerUserService;

@RestController
@CrossOrigin
@RequestMapping("/seller")
public class SellerUserController {

	@Autowired
	SellerUserService service;

	@RequestMapping("/")
	Iterable<Seller> getAllSellers() {
		return service.getAllSellers();
	}
	
	@RequestMapping("/{sellerId}")
	Optional<Seller> getSellerById(@PathVariable Integer sellerId) {
		return service.getSellerById(sellerId);
	}


	@RequestMapping(method = RequestMethod.POST, value = "/signup")
	void addSeller(@RequestBody Seller seller) {
		seller.setCreatedDate(new Date().toString());
		service.addSeller(seller);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/seller/{sellerId}")
	void updateSeller(@RequestBody Seller seller, @PathVariable Integer sellerId) {
		service.updateSeller(seller);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{sellerId}")
	void deleteSeller(@PathVariable Integer sellerId) {
		service.deleteSeller(sellerId);
	}

}
