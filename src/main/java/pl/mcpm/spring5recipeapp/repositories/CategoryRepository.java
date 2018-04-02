package pl.mcpm.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mcpm.spring5recipeapp.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}