package com.cts.emart.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.entity.EmartUsers;

@Repository
public interface UserRepository extends CrudRepository<EmartUsers, Integer>{

}
