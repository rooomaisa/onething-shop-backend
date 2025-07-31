package com.store.onething_shop.repository;


import com.store.onething_shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Since we only have 1 product for now, just grab the first one
    Optional<Product> findTopByOrderByIdAsc();
}
