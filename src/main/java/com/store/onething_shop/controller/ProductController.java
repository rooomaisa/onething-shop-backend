package com.store.onething_shop.controller;


import com.store.onething_shop.model.Product;
import com.store.onething_shop.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/api/v1/product")
    public Product getProduct() {
        // In a real app you'd handle "not found" nicely; for now we assume it exists
        return repo.findTopByOrderByIdAsc()
                .orElseThrow(() -> new RuntimeException("No product found"));
    }
}
