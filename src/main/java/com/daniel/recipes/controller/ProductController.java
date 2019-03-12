package com.daniel.recipes.controller;

import com.daniel.recipes.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductController extends JpaRepository<Product, Long> {
}
