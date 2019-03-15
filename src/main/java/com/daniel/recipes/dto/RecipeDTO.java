package com.daniel.recipes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeDTO {

    private Long id;
    private String name;
    private List<Long> productsId;
}
