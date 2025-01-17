package com.autotradingsystem.messages.events.trading;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class TradingStoppedEvent {

    private final UUID tradingId;

}
