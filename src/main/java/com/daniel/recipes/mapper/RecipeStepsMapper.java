package com.daniel.recipes.mapper;

import com.daniel.recipes.entity.RecipeProduct;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface RecipeStepsMapper {

    RecipeProduct toDTO

}
