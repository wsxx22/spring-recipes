package com.daniel.recipes.controller;

import com.daniel.recipes.entity.Product;
import com.daniel.recipes.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PostMapping("/save")
    public Product save (@RequestBody Product product) {
        return productService.save(product);
    }

}
