package com.daniel.recipes.service;

import com.daniel.recipes.repository.RecipeStepsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeStepsService {

    private RecipeStepsRepository recipeStepsRepository;

    @Autowired
    public RecipeStepsService(RecipeStepsRepository recipeStepsRepository) {
        this.recipeStepsRepository = recipeStepsRepository;
    }



}
