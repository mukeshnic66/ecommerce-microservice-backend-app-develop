package com.mukeshkumarprasad.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mukeshkumarprasad.app.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	
	
}
