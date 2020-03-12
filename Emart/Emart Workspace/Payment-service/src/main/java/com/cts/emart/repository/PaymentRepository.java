package com.cts.emart.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.emart.entity.Payment;

public interface PaymentRepository extends CrudRepository<Payment,Integer>{
	Optional<Payment> findById(int cvv);


}
