package com.mukeshkumarprasad.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mukeshkumarprasad.app.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	
	
}
