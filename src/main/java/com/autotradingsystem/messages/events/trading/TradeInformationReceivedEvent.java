package com.autotradingsystem.messages.events.trading;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class TradeInformationReceivedEvent {

    private final UUID uuid;
    private final String stockTradeType;
    private final String strategyType;
    private final String ticker;
    private final Integer quantity;

}
