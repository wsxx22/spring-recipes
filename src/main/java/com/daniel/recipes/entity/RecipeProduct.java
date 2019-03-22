package com.daniel.recipes.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "recipe_products")
@NoArgsConstructor
@AllArgsConstructor
public class RecipeProduct implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private String amount;


}
