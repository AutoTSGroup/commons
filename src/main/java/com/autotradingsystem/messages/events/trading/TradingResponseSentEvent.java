package com.autotradingsystem.messages.events.trading;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradingResponseSentEvent {

    private String ticker;
    private String operationType;
    private String strategyType;
    private BigDecimal price;
    private OffsetDateTime dateTime;
    private BigDecimal stopLoss;
    private BigDecimal takeProfit;
    private Long userId;
    private UUID brokerId;
    private String tradingId;
}
