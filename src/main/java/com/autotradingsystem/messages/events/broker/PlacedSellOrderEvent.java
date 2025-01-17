package com.autotradingsystem.messages.events.broker;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
@Data
public class PlacedSellOrderEvent {

    private final UUID brokerId;
    private final Long userId;
    private final String figi;
    private final BigDecimal expectedAmount;
    private final Long timestamp;
    private final String name;
    private final String tradingStrategy;

}
