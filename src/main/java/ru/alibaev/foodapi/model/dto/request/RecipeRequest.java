package ru.alibaev.foodapi.model.dto.request;

import com.sun.jdi.request.StepRequest;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class RecipeRequest {
    private String name;
    private Integer duration;
    private UUID authorUuid;
    private List<StepRequest> steps;
    private List<RecipeIngredientRequest> ingredients;
}

