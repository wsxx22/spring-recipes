package com.daniel.recipes.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product extends AbstractEntity {

    private String name;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Category category;

}
