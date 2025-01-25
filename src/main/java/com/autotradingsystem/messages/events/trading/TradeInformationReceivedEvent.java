package com.autotradingsystem.messages.events.trading;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradeInformationReceivedEvent {

    private UUID uuid;
    private String stockTradeType;
    private String strategyType;
    private String ticker;
    private Integer quantity;

}
