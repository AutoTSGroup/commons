package com.autotradingsystem.messages.commands.broker;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Builder
@Data
public class CreateBrokerCommand {

  @TargetAggregateIdentifier
  private UUID brokerId;
  private String token;
  private Long userId;
  private String brokerName;
  private boolean valid = false;
}
