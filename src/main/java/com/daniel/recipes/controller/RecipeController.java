package com.daniel.recipes.controller;

import com.daniel.recipes.dto.RecipeDTO;
import com.daniel.recipes.dto.RecipeProductDTO;
import com.daniel.recipes.dto.StepDTO;
import com.daniel.recipes.entity.Recipe;
import com.daniel.recipes.mapper.RecipeMapper;
import com.daniel.recipes.mapper.RecipeProductMapper;
import com.daniel.recipes.mapper.RecipeStepsMapper;
import com.daniel.recipes.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private RecipeService recipeService;
    private RecipeMapper recipeMapper;
    private RecipeProductMapper recipeProductMapper;
    private RecipeStepsMapper recipeStepsMapper;

    @Autowired
    public RecipeController(RecipeService recipeService,
                            RecipeMapper recipeMapper,
                            RecipeProductMapper recipeProductMapper,
                            RecipeStepsMapper recipeStepsMapper) {
        this.recipeService = recipeService;
        this.recipeMapper = recipeMapper;
        this.recipeProductMapper = recipeProductMapper;
        this.recipeStepsMapper = recipeStepsMapper;
    }

    @PostMapping("/add")
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        recipeService.deleteById(id);
    }

    @GetMapping("/all")
    public List<RecipeDTO> findAll() {
//        return recipeService.findAll();
        return recipeMapper.recipeList(recipeService.findAll());
    }

    @GetMapping("/{id}") // id przepisu
    public RecipeDTO getRecipeById(@PathVariable Long id) {
        return recipeMapper.toDTO(recipeService.findById(id));
    }

    @GetMapping("/{id}/products") // id przepisu
    public Set<RecipeProductDTO> getRecipeProducts(@PathVariable Long id) {
        return recipeProductMapper.toDTOSet(recipeService.findById(id).getRecipeProducts());
    }

    @GetMapping("/{id}/steps") // id przepisu
    public List<StepDTO> findAllStepsByIdRecipe(@PathVariable Long id) {
        return recipeStepsMapper.toDTOList(recipeService.findById(id).getSteps());
    }



}
