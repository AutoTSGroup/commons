package com.autotradingsystem.messages.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShareDto {

    private String figi;
    private String name;
    private BigDecimal amount;
    private String tradingStrategy;

}
