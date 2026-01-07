package ru.alibaev.foodapi.model.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.UUID;

@Data
public class CommentCreateRequest {

    @Schema(description = "UUID рецепта")
    private UUID recipeUuid;

    @Schema(description = "UUID картинки комментария")
    private UUID imageUuid;

    @Schema(description = "Текст комментария")
    private String text;

}

