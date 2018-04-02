package pl.mcpm.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mcpm.spring5recipeapp.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
