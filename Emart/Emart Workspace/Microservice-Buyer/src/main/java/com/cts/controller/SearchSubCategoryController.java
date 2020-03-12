package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.SubCategory;
import com.cts.service.SearchSubCategoryService;

@RestController
@CrossOrigin
@RequestMapping("/category")
public class SearchSubCategoryController {

	@Autowired
	SearchSubCategoryService service;


	@RequestMapping("/{categoryName}")
	List<SubCategory> searchByCategory(@PathVariable String categoryName){
		return (List<SubCategory>) service.searchByCategory(categoryName);
	}
	
}
