package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Category;
import com.cts.entity.Product;
import com.cts.entity.Seller;
import com.cts.entity.SubCategory;
import com.cts.service.ProductService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/update")
public class ProductController {

	@Autowired
	ProductService service;

	@RequestMapping("/all")
	List<Product> getAllProducts() {
		return service.getAllProducts();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/product/{categoryId}/{subCategoryId}/{sellerId}")
	void addProduct(@RequestBody Product product, @PathVariable int categoryId, @PathVariable int subCategoryId,
			@PathVariable Integer sellerId) {
		product.setSubCategory(new SubCategory(subCategoryId));
		product.setCategory(new Category(categoryId));
		product.setSeller(new Seller(sellerId));
		service.addProduct(product);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/products")
	void updateProducts(@RequestBody Product product) {
		service.updateProducts(product);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/products/delete/{productId}")
	void deleteProduct(@PathVariable Integer productId) {
		service.deleteProduct(productId);
	}

	@RequestMapping("/products/{productId}")
	Optional<Product> searchById(@PathVariable Integer productId) {
		return service.searchById(productId);
	}

	@RequestMapping("/product/products/{productName}")
	Product searchByName(@PathVariable String productName) {
		return service.searchByName(productName);
	}

	@RequestMapping("/{categoryName}")
	List<Product> searchByCategory(@PathVariable String categoryName) {
		return (List<Product>) service.searchByCategory(categoryName);
	}

	@RequestMapping("/category/{subCategoryName}")
	List<Product> searchBySubCategory(@PathVariable String subCategoryName) {
		return (List<Product>) service.searchBySubCategory(subCategoryName);
	}

	@RequestMapping("/products/stock/{productId}")
	int getStock(@PathVariable int productId) {
		return service.getStock(productId);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/products/delete/name/{productName}")
	void deleteProductByName(@PathVariable String productName) {
		service.deleteProductByName(productName);
	}

	@RequestMapping("seller/{sellerId}")
	List<Product> getAllProductsBySellerId(@PathVariable Integer sellerId) {
		return service.getAllProductsBySellerId(sellerId);
	}

}
