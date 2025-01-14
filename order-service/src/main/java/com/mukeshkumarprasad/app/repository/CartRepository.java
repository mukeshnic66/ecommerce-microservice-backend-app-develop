package com.mukeshkumarprasad.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mukeshkumarprasad.app.domain.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
	
	
	
}
