package ru.alibaev.foodapi.model.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class MeasureUnitResponse {
    private UUID uuid;
    private String one;
    private String few;
    private String many;
}
