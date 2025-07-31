package com.store.onething_shop.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private int priceCents;

    public Product() {
    }

    public Product(String name, String description, int priceCents) {
        this.name = name;
        this.description = description;
        this.priceCents = priceCents;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) { this.description = description; }

    public int getPriceCents() {
        return priceCents;
    }
    public void setPriceCents(int priceCents) { this.priceCents = priceCents; }
}
