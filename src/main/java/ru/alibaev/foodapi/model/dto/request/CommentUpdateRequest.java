package ru.alibaev.foodapi.model.dto.request;

import lombok.Data;

@Data
public class CommentUpdateRequest {
    private String text;
}
