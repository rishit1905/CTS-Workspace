package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Product;
import com.cts.repo.FilterItemRepository;

@Service
public class FilterItemService {

	@Autowired
	FilterItemRepository repo;
	
	public List<Product> filterByStartPrice(double startPrice) {
		return repo.findAllByStartPrice(startPrice);
	}

	public List<Product> filterByEndPrice(double endPrice) {
		return repo.findAllByEndPrice(endPrice);
	}

	public List<Product> filterByPrice(double startPrice, double endPrice) {
		return repo.findAllByPrice(startPrice,endPrice);
	}

}
