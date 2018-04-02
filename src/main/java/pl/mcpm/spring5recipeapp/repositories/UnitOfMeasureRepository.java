package pl.mcpm.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mcpm.spring5recipeapp.models.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
