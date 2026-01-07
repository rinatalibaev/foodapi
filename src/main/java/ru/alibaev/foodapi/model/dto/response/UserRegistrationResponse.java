package ru.alibaev.foodapi.model.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class UserRegistrationResponse {
    private UUID uuid;
}
