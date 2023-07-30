package sia.tacocloud.domain.ingredient;

import sia.tacocloud.domain.ingredient.Ingredient;

import java.util.Optional;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();


    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
