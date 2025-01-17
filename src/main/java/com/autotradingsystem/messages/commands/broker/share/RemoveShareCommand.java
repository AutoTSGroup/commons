package com.autotradingsystem.messages.commands.broker.share;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Builder
@Data
public class RemoveShareCommand {

    @TargetAggregateIdentifier
    private UUID brokerId;
    private String figi;

}
