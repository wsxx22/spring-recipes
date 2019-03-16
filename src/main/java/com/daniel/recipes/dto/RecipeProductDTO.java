package com.daniel.recipes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeProductDTO implements Serializable {

    private Long recipeId;

    private Long productId;

    private String amount;
}
