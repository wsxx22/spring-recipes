package com.daniel.recipes.service;

import com.daniel.recipes.entity.Category;
import com.daniel.recipes.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

//@Service
//public class CategoryService {
//
//    @Autowired
//    private CategoryRepository categoryRepository;
//
//    public CategoryService() {
//
//    }
//}

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

    public Category addCategory (Category category) {
        return categoryRepository.save(category);
    }

    public Optional<Category> updateCategory (Long id) {
        return categoryRepository.findById(id);
    }

}