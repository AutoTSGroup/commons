package com.autotradingsystem.messages.commands.trading;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.axonframework.modelling.command.AggregateIdentifier;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder
@Data
public class StartTradingCommand {

  @AggregateIdentifier
  private UUID tradingId;
  private UUID brokerId;
  private Long userId;
  private String figi;
  private String name;
  private BigDecimal amount;
  private String tradingStrategy;

}
