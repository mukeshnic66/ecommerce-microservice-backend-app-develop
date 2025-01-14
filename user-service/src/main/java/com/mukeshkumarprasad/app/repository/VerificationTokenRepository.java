package com.mukeshkumarprasad.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mukeshkumarprasad.app.domain.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Integer> {
	
	
	
}
