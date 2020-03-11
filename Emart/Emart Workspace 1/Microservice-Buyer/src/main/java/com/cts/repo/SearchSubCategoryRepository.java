package com.cts.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.SubCategory;

@Repository
public interface SearchSubCategoryRepository extends CrudRepository<SubCategory, Integer> {

	@Query(value = "SELECT * FROM Sub_Categories s WHERE s.CTID IN(SELECT CTID FROM Categories c WHERE c.CTNM=:categoryName)", nativeQuery = true)
	List<SubCategory> findAllByCategory(String categoryName);

}
