package ru.alibaev.foodapi.model.dto.request;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class RecipeIngredientRequest {
    private UUID ingredientUuid;
    private UUID measureUnitUuid;
    private BigDecimal count;
}
