package com.daniel.recipes.repository;

import com.daniel.recipes.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryName(String name);
    List<Product> findByCategoryId(Long id);
}
