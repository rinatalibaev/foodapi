package ru.alibaev.foodapi.model.dto.request;

import lombok.Data;

import java.util.UUID;

@Data
public class UserRequest {
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private UUID avatarImageUuid;
}
