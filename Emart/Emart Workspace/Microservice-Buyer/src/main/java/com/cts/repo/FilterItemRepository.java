package com.cts.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Product;

@Repository
public interface FilterItemRepository extends CrudRepository<Product, Integer>{

	@Query(value = "SELECT * FROM PRODUCTS p WHERE p.PRICE>=:startPrice", nativeQuery = true)
	List<Product> findAllByStartPrice(double startPrice);

	@Query(value = "SELECT * FROM PRODUCTS p WHERE p.PRICE<=:endPrice", nativeQuery = true)
	List<Product> findAllByEndPrice(double endPrice);

	@Query(value = "SELECT * FROM PRODUCTS p WHERE p.PRICE BETWEEN :startPrice AND :endPrice", nativeQuery = true)
	List<Product> findAllByPrice(double startPrice, double endPrice);

}
