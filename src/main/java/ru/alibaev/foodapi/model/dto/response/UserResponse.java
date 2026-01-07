package ru.alibaev.foodapi.model.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class UserResponse {
    private UUID uuid;
    private String firstName;
    private String lastName;
    private ImageResponse avatar;
}
