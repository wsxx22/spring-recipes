package com.daniel.recipes.controller;

import com.daniel.recipes.dto.ProductDTO;
import com.daniel.recipes.entity.Category;
import com.daniel.recipes.entity.Product;
import com.daniel.recipes.mapper.ProductMapper;
import com.daniel.recipes.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    private ProductMapper productMapper;


    @Autowired
    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }


    @GetMapping("/all")
    public List<ProductDTO> findAll() {
        return productMapper.toDTOList(productService.findAll());
    }

    @PostMapping("/save")
    public ProductDTO save(@RequestBody Product product) {
        return productMapper.toDTO(productService.save(product));
    }

    @GetMapping("/category/name/{categoryName}")
    public List<ProductDTO> findByCategory (@PathVariable String categoryName) {
//        return productService.findByCategoryName(categoryName);
        return productMapper.toDTOList(productService.findByCategoryName(categoryName));
    }

    @GetMapping("/category/id/{categoryId}")
    public List<ProductDTO> findByCategory (@PathVariable Long categoryId) {
//        return productService.findByCategoryId(categoryId);
        return productMapper.toDTOList(productService.findByCategoryId(categoryId));
    }
}
