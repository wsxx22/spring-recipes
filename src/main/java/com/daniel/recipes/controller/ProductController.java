package com.daniel.recipes.controller;

import com.daniel.recipes.dto.ProductDTO;
import com.daniel.recipes.entity.Category;
import com.daniel.recipes.entity.Product;
import com.daniel.recipes.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<ProductDTO> findAll() {
        return productService.findAll();
    }

    @PostMapping("/save")
    public Product save (@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/category/name/{categoryName}")
    public List<ProductDTO> findByCategory (@PathVariable String categoryName) {
        return productService.findByCategoryName(categoryName);
    }

    @GetMapping("/category/id/{categoryId}")
    public List<ProductDTO> findByCategory (@PathVariable Long categoryId) {
        return productService.findByCategoryId(categoryId);
    }
}
