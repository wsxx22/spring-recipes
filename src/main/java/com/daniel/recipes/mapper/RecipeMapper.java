package com.daniel.recipes.mapper;

import com.daniel.recipes.dto.RecipeDTO;
import com.daniel.recipes.entity.Recipe;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RecipeMapper {

    @Mappings({
            @Mapping(target = "userId", source = "user.id")
    })
    RecipeDTO toDTO (Recipe recipe);

    List<RecipeDTO> recipeList (List<Recipe> recipeList);

}
