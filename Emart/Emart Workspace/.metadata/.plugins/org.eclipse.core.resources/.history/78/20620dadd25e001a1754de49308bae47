package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Product;
import com.cts.service.SearchItemService;

@RestController
public class SearchItemController {

	@Autowired
	SearchItemService service;
	
	@RequestMapping("/products")
	List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@RequestMapping("/products/{id}")
	Optional<Product> searchById(@PathVariable Integer id){
		return service.searchById(id);
	}
	
//	@RequestMapping("/products/{name}")
//	List<Product> searchByName(@PathVariable String name){
//		return (List<Product>)service.searchByName(name);
//	}
	
//	searchByCategory(){}
//	
//	searchBySubCategory(){}
//	
	
}
