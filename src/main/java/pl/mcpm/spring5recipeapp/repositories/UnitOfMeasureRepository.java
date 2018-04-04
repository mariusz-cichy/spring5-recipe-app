package pl.mcpm.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mcpm.spring5recipeapp.models.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
