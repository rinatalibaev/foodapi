package ru.alibaev.foodapi.model.dto.request;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class RecipeCreateRequest {
    private String name;
    private List<StepRequest> steps;
    private List<RecipeIngredientRequest> ingredients;
    private UUID photoUuid;
}
