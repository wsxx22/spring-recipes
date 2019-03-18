package com.daniel.recipes.mapper;

import com.daniel.recipes.dto.RecipeDTO;
import com.daniel.recipes.entity.Recipe;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RecipeMapper {

    RecipeDTO toDTO (Recipe recipe);
    List<RecipeDTO> recipeList (List<Recipe> recipeList);

}
