package com.cts.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Customer;

@Repository
public interface CustomerUserRepository extends CrudRepository<Customer, Integer> {

}
