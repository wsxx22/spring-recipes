package com.daniel.recipes.repository;

import com.daniel.recipes.entity.Step;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeStepsRepository extends JpaRepository<Step, Long> {
}
