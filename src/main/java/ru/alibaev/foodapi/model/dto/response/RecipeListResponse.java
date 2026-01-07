package ru.alibaev.foodapi.model.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class RecipeListResponse {
    private UUID uuid;
    private String name;
    private Integer duration;
    private ImageResponse image;
}

