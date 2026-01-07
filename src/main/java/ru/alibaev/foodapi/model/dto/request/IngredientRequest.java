package ru.alibaev.foodapi.model.dto.request;

import lombok.Data;

import java.util.UUID;

@Data
public class IngredientRequest {
    private String name;
    private UUID measureUnitUuid;
}
