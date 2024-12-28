package com.autotradingsystem.messages.commands.trading;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.AggregateIdentifier;

@Builder
@Data
public class StopTradingCommand {

  @AggregateIdentifier
  private final UUID tradingId;
}
