package com.daniel.recipes.controller;

import com.daniel.recipes.dto.CategoryDTO;
import com.daniel.recipes.entity.Category;
import com.daniel.recipes.mapper.CategoryMapper;
import com.daniel.recipes.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/categories")
public class CategoryController {

    private CategoryService categoryService;
    private CategoryMapper categoryMapper;

    @Autowired
    public CategoryController(CategoryService categoryService, CategoryMapper categoryMapper) {
        this.categoryService = categoryService;
        this.categoryMapper = categoryMapper;
    }


    @GetMapping("")
    public String home() {
        return "home";
    }

    @GetMapping("/all")
    public List<CategoryDTO> all() {
        return categoryMapper.toDTOList(categoryService.findAll());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById (@PathVariable("id") Long id) {
        categoryService.deleteById(id);
    }

    @PostMapping("/add")
    public Category addCategory (@RequestBody Category category) {
        return categoryService.addCategory(category);
    }

//    @PutMapping("/update/{id}") /* */
//    public Optional<Category> updateCategory (@RequestBody Category newCategory, @PathVariable("id") Long id) {
//        return categoryService.updateCategory(id);
//    }
}
