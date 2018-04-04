package pl.mcpm.spring5recipeapp.services;

import pl.mcpm.spring5recipeapp.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);
}