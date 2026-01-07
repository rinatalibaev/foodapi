package ru.alibaev.foodapi.model.dto.response;

import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
public class CommentResponse {
    private UUID uuid;
    private String text;
    private UserResponse author;
    private ImageResponse image;
    private OffsetDateTime createdAt;
}

