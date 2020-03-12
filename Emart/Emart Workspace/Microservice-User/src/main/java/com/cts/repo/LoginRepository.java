package com.cts.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.EmartUsers;

@Repository
public interface LoginRepository extends CrudRepository<EmartUsers, Integer> {

	@Query(value = "SELECT * from EMART_USERS e WHERE e.UNM=:userName AND e.PWD=:password", nativeQuery = true)
	EmartUsers findByUserName(String userName, String password);

}
