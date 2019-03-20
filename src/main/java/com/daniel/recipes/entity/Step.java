package com.daniel.recipes.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Step extends AbstractEntity {

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Recipe recipe;

    private Long stepNumber;

    private String step;

    @OneToMany(mappedBy = "step", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<StepProduct> stepProducts = new ArrayList<>();
}

