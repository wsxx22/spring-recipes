package com.daniel.recipes.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeSteps extends AbstractEntity{

    private Long stepNumber;

    List<RecipeProduct> recipeProducts;


}

