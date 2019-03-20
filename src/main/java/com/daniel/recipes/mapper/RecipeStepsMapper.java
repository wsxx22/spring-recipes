package com.daniel.recipes.mapper;

import com.daniel.recipes.dto.StepDTO;
import com.daniel.recipes.entity.Step;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface RecipeStepsMapper {

    @Mappings({
            @Mapping(target = "recipeId", source = "recipe.id")
    })
    StepDTO toDTO (Step step);


    List<StepDTO> toDTOList (List<Step> steps);
}
