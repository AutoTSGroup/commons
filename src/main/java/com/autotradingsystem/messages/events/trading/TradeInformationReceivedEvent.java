package com.autotradingsystem.messages.events.trading;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TradeInformationReceivedEvent {

  private final UUID uuid;
  private final String stockTradeType;
  private final String strategyType;
  private final String ticker;
  private final Integer quantity;

}
