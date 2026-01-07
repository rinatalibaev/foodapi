package ru.alibaev.foodapi.model.dto.request;

import lombok.Data;

@Data
public class MeasureUnitCreateRequest {
    private String one;
    private String few;
    private String many;
}
