package ru.alibaev.foodapi.model.dto.response;

import lombok.Data;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
public class RecipeResponse {
    private UUID uuid;
    private String name;
    private Integer duration;
    private UserResponse author;
    private ImageResponse image;
    private List<StepResponse> steps;
    private List<RecipeIngredientResponse> ingredients;
    private Set<CommentResponse> comments;
}

