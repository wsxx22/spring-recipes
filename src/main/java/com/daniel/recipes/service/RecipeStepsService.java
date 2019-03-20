package com.daniel.recipes.service;

import com.daniel.recipes.dto.StepDTO;
import com.daniel.recipes.mapper.RecipeStepsMapper;
import com.daniel.recipes.repository.RecipeStepsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeStepsService {

    private RecipeStepsRepository recipeStepsRepository;
    private RecipeStepsMapper recipeStepsMapper;

    @Autowired
    public RecipeStepsService(RecipeStepsRepository recipeStepsRepository, RecipeStepsMapper recipeStepsMapper) {
        this.recipeStepsRepository = recipeStepsRepository;
        this.recipeStepsMapper = recipeStepsMapper;
    }

    public List<StepDTO> findAll () {
        return recipeStepsMapper.toDTOList(recipeStepsRepository.findAll());
    }




}
