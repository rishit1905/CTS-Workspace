package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.SubCategory;
import com.cts.repo.SearchSubCategoryRepository;

@Service
public class SearchSubCategoryService {

	@Autowired
	SearchSubCategoryRepository repo;
	
	public List<SubCategory> searchByCategory(String categoryName) {
		return (List<SubCategory>) repo.findAllByCategory(categoryName);
	}



}
