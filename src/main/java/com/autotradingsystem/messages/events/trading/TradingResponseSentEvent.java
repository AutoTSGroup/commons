package com.autotradingsystem.messages.events.trading;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder
@Data
public class TradingResponseSentEvent {

    private String ticker;
    private String operationType;
    private String strategyType;
    private BigDecimal price;
    private OffsetDateTime dateTime;
    private BigDecimal stopLoss;
    private BigDecimal takeProfit;
    private Long userId;

}
