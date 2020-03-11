package com.cts.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.PurchaseHistory;

@Repository
public interface CheckoutRepository extends CrudRepository<PurchaseHistory, Integer> {

}
