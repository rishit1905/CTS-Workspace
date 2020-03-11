package com.cts.service;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Product;
import com.cts.repository.ProductRepository;



@Service
public class ProductService {

	@Autowired
	ProductRepository repo;
	
	public Optional<Product> searchById(Integer productId) {
		return repo.findById(productId);
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

	public void addProduct(Product product) {
		repo.save(product);
		
	}

	public void updateProducts(Product product) {
		repo.save(product);
		
	}

	public void deleteProduct(int productId) {
		repo.deleteById(productId);
		
	}

	public int getStock(int productId) {
		// TODO Auto-generated method stub
		return repo.getStockById(productId);
	}

	public void deleteProductByName(String productName) {
		repo.deleteByItemName(productName);
	}

	public List<Product> getAllProductsBySellerId(Integer sellerId) {
		
		return repo.getAllProductsBySellerId(sellerId);
	}


}
