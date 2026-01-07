package ru.alibaev.foodapi.model.dto.response;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class MeasureUnitForCountResponse {
    private UUID uuid;
    private BigDecimal count;
    private String measureUnit;
}
