package com.daniel.recipes.service;

import com.daniel.recipes.entity.Product;
import com.daniel.recipes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

}
