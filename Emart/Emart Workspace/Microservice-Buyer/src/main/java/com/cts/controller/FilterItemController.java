package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Product;
import com.cts.service.FilterItemService;

@RestController
@CrossOrigin
@RequestMapping("/filter")
public class FilterItemController {
	
	@Autowired
	FilterItemService service;
	
	@RequestMapping("/products/{startPrice}")
	List<Product> filterByStartPrice(@PathVariable double startPrice){
		return (List<Product>)service.filterByStartPrice(startPrice);
	}
	
	@RequestMapping("/product/{endPrice}")
	List<Product> filterByEndPrice(@PathVariable double endPrice){
		return (List<Product>)service.filterByEndPrice(endPrice);
	}
	
	@RequestMapping("/products/{startPrice}/{endPrice}")
	List<Product> filterByPrice(@PathVariable double startPrice, @PathVariable double endPrice){
		return (List<Product>)service.filterByPrice(startPrice,endPrice);
	}
}
