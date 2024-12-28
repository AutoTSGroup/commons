package com.autotradingsystem.messages.events.trading;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TradingStoppedEvent {

  private final UUID tradingId;
}
