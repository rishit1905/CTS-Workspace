package com.cts.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.entity.Payment;

public interface PaymentRepository extends CrudRepository<Payment,Integer>{
	Optional<Payment> findById(int cvv);


}
