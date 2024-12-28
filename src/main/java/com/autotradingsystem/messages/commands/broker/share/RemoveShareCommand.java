package com.autotradingsystem.messages.commands.broker.share;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Builder
@Data
public class RemoveShareCommand {

  @TargetAggregateIdentifier
  private UUID brokerId;
  private String figi;

}
