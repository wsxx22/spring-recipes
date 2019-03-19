package com.daniel.recipes.dto;

import com.daniel.recipes.entity.Recipe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeStepsDTO {

    private Long id;
    private Long stepNumber;
    private Recipe recipe;

}
