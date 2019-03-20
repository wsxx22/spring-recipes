package com.daniel.recipes.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "step_products")
@AllArgsConstructor
@NoArgsConstructor
public class StepProduct implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "step_id")
    private Step step;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private String amount;

}
