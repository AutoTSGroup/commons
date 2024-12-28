package com.autotradingsystem.messages.commands.broker;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Builder
@Data
public class PlaceSellOrderCommand {

  @TargetAggregateIdentifier
  private final UUID tradingId;
  private final String figi;
  private final BigDecimal amount;

}
