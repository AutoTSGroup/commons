package com.autotradingsystem.messages.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ShareDto {

  private String figi;
  private String name;
  private BigDecimal amount;
  private String tradingStrategy;

}
