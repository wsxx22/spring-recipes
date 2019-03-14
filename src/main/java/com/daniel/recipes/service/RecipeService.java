package com.daniel.recipes.service;

import com.daniel.recipes.entity.Recipe;
import com.daniel.recipes.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private RecipeRepository recipeRepository;

    @Autowired
    public RecipeService (RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe addRecipe (Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public Recipe updateRecipe (Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public void deleteById (Long id) {
        recipeRepository.deleteById(id);
    }

    public List<Recipe> findAll () {
        return recipeRepository.findAll();
    }

}
