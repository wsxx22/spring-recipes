package com.daniel.recipes.controller;

import com.daniel.recipes.entity.Category;
import com.daniel.recipes.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/category")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("")
    public String home() {
        return "home";
    }

    @GetMapping("/all")
    public List<Category> all() {
        return categoryService.findAll();
    }

}