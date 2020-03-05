package com.cts.service;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Product;
import com.cts.repo.SearchItemRepository;

@Service
public class SearchItemService {

	@Autowired
	SearchItemRepository repo;
	
	public Optional<Product> searchById(Integer id) {
		return repo.findById(id);
	}

	public List<Product> getAllProducts() {
		return (List<Product>) repo.findAll();
	}

//	public List<Product> searchByName(String name) {
//		return repo.findAllByName(name);
//	}

}
