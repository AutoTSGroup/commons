package com.autotradingsystem.messages.commands.broker;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Builder
@Data
public class UpdateBrokerCommand {

    @TargetAggregateIdentifier
    private UUID brokerId;
    private String brokerName;
    private Long userId;
    private boolean valid;
}
