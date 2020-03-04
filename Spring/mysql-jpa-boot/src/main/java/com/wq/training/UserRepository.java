package com.wq.training;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer>{

	User findByAddress(String address);
	
	
//	@Query(value = "select * from user where name :name", nativeQuery = true)
//	User findOther(@Param(value = "name") String name);
	
	
}



//Table <-> Class