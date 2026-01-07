package ru.alibaev.foodapi.model.dto.request;

import lombok.Data;

@Data
public class StepRequest {
    private Integer stepOrder;
    private String name;
    private Integer duration;
}
