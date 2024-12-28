package com.autotradingsystem.messages.commands.broker;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Builder
@Data
public class UpdateBrokerCommand {

  @TargetAggregateIdentifier
  private UUID brokerId;
  private String brokerName;
  private Long userId;
  private boolean valid;
}
