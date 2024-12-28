package com.autotradingsystem.messages.events.trading;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder
@Data
public class TradingStartedEvent {

  private final UUID tradingId;
  private final UUID brokerId;
  private final Long userId;
  private final String figi;
  private final String name;
  private final BigDecimal amount;
  private final String tradingStrategy;
}
