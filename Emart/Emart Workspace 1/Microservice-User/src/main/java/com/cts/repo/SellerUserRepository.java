package com.cts.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Seller;

@Repository
public interface SellerUserRepository extends CrudRepository<Seller, Integer> {

}
