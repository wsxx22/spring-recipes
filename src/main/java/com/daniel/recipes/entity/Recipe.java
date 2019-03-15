package com.daniel.recipes.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe extends AbstractEntity {

    private String name;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "recipe_products",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;

    //join column User -> id
    // private Long userId;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private User user;
}
