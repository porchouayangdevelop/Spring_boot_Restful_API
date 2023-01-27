package com.restfullapi.jwt.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfullapi.jwt.models.product.Product;

@Repository

public interface productRepository extends JpaRepository<Product, Long> {

    Optional<Product> findProductById(Long id);

}
