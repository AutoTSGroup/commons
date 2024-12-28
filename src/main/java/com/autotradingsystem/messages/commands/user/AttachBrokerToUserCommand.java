package com.autotradingsystem.messages.commands.user;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Builder
@Data
public class AttachBrokerToUserCommand {

  @TargetAggregateIdentifier
  private Long userId;
  private UUID brokerId;

}
