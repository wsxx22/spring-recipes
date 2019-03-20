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

    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    public Recipe findById(Long id) {
        return recipeRepository.findById(id).orElseThrow(() -> new RuntimeException("Nie ma takiego przepisu"));
    }



//    private RecipeDTO convertToDTO(Recipe recipe) {
//        return new RecipeDTO(
//                recipe.getId(),
//                recipe.getName(),
//                recipe.getRecipeProducts().stream().map(rp -> convertRecipeProductToRecipeProductDTO(rp)).collect(Collectors.toList()));
//
//    }
//
//    private List<RecipeDTO> convertToDTO(List<Recipe> recipes) {
//        return recipes.stream().map(r -> convertToDTO(r)).collect(Collectors.toList());
//    }
//
//    private RecipeProductDTO convertRecipeProductToRecipeProductDTO (RecipeProduct recipeProduct) {
//        return new RecipeProductDTO(
//                recipeProduct.getRecipe().getId(),
//                recipeProduct.getProduct().getId(),
//                recipeProduct.getAmount()
//        );
//    }

}
