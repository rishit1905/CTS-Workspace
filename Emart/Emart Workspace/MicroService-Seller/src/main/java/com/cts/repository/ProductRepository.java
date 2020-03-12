package com.cts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.entity.Product;




@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

	Product findByProductName(String productName);

	@Query(value = "SELECT * FROM Products p WHERE p.CTID IN(SELECT CTID FROM Categories c WHERE c.CTNM=:categoryName)", nativeQuery = true)
	List<Product> findAllByCategory(String categoryName);

	@Query(value = "SELECT * FROM Products p WHERE p.SBID IN(SELECT SBID FROM Sub_Categories c WHERE c.SBNM=:subCategoryName)", nativeQuery = true)
	List<Product> findAllBySubCategory(String subCategoryName);
	
	@Query(value = "select stock from Products p where p.PID=:productId", nativeQuery = true)
	int getStockById(Integer productId);
	
	
	
	@Query(value = "select * from Products p where p.SID=:sellerId", nativeQuery = true)
	List<Product> getAllProductsBySellerId(Integer sellerId);
	
	

	
	
	@Transactional
	@Modifying
	@Query(value = "delete from Products p where p.PNM=:productName",nativeQuery = true)
	void deleteByItemName(@Param(value = "productName") String productName);

}
