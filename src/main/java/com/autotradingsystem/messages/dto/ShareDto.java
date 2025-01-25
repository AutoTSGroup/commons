package com.autotradingsystem.messages.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShareDto {

    private String figi;
    private String name;
    private BigDecimal amount;
    private String tradingStrategy;

}
