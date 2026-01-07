package ru.alibaev.foodapi.model.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class StepResponse {
    private UUID uuid;
    private Integer stepOrder;
    private String name;
    private Integer duration;
}
