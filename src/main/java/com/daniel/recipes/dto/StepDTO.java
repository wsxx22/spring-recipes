package com.daniel.recipes.dto;

import com.daniel.recipes.entity.Recipe;
import com.daniel.recipes.entity.StepProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StepDTO {

    private Long id;
    private Long recipeId;
    private Long stepNumber;
    private String step;

//    private List<StepProductDTO>
}
