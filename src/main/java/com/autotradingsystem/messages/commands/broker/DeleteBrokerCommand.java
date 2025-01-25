package com.autotradingsystem.messages.commands.broker;

import lombok.*;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Builder
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class DeleteBrokerCommand {

    @TargetAggregateIdentifier
    private UUID brokerId;
}
