package ru.alibaev.foodapi.model.dto.response;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class RecipeIngredientResponse {
    private UUID uuid;
    private String ingredientName;
    private BigDecimal count;
    private String measureUnit; // one/few/many
}
