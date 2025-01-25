package com.autotradingsystem.messages.events.broker;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlacedBuyOrderEvent {

    private UUID brokerId;
    private Long userId;
    private String figi;
    private BigDecimal expectedAmount;
    private Long timestamp;
    private String name;
    private String tradingStrategy;

}
