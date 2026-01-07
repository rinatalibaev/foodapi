package ru.alibaev.foodapi.model.dto.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FreezerResponse {

    private String ingredientName;
    private String measureUnit;
    private BigDecimal count;
}
