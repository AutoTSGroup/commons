package com.autotradingsystem.messages.commands.broker;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Builder
@Data
@EqualsAndHashCode
public class DeleteBrokerCommand {

    @TargetAggregateIdentifier
    private UUID brokerId;
}
