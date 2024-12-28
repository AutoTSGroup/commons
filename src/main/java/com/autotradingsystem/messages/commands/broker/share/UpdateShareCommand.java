package com.autotradingsystem.messages.commands.broker.share;

import com.autotradingsystem.messages.dto.ShareDto;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Builder
@Data
public class UpdateShareCommand {

  @TargetAggregateIdentifier
  private UUID brokerId;
  private ShareDto shareDto;

}
