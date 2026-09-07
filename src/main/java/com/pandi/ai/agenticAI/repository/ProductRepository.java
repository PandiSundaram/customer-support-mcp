package com.pandi.ai.agenticAI.repository;

import com.pandi.ai.agenticAI.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findBySkuIgnoreCase(String sku);

    List<Product> findByNameContainingIgnoreCaseOrSkuContainingIgnoreCase(String name, String sku);
}