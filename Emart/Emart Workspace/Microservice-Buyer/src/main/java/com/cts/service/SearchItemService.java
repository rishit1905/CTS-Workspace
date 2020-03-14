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

	public Product searchByName(String productName) {
		return (Product) repo.findByProductName(productName);
	}

	public List<Product> searchByCategory(String categoryName) {
		return (List<Product>) repo.findAllByCategory(categoryName);
	}

	public List<Product> searchBySubCategory(String subCategoryName) {
		return (List<Product>) repo.findAllBySubCategory(subCategoryName);
	}

	public List<Product> searchProductBySearchCriteria(String search){
		return (List<Product>) repo.findAllBySearch(search);
	}
}
