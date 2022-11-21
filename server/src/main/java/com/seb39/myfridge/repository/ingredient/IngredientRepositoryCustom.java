package com.seb39.myfridge.repository.ingredient;

import java.util.List;

public interface IngredientRepositoryCustom {
    List<String> searchNames(String name);
}
