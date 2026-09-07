package com.pandi.ai.agenticAI.repository;

import com.pandi.ai.agenticAI.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByEmailIgnoreCase(String email);
}