package com.autotradingsystem.messages.commands.broker;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

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
