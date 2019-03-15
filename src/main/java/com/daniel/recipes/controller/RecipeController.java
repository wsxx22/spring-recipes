package com.daniel.recipes.controller;

import com.daniel.recipes.dto.RecipeDTO;
import com.daniel.recipes.entity.Recipe;
import com.daniel.recipes.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping("/add")
    public Recipe addRecipe (@RequestBody Recipe recipe) {
       return recipeService.addRecipe(recipe);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        recipeService.deleteById(id);
    }

    @GetMapping("/all")
    public List<RecipeDTO> findAll () {
        return recipeService.findAll();
    }


}
