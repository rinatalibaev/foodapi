package ru.alibaev.foodapi.model.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class IngredientResponse {
    private UUID uuid;
    private String name;
}
