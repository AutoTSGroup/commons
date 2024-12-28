package com.autotradingsystem.messages.commands.broker;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Builder
@Data
@EqualsAndHashCode
public class DeleteBrokerCommand {

  @TargetAggregateIdentifier
  private UUID brokerId;
}
