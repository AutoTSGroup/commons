package com.autotradingsystem.messages.events.trading;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradingStartedEvent {

    private UUID tradingId;
    private UUID brokerId;
    private Long userId;
    private String figi;
    private String name;
    private BigDecimal amount;
    private String tradingStrategy;

}
