package com.autotradingsystem.messages.commands.broker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrokerCommand {

    @TargetAggregateIdentifier
    private UUID brokerId;
    private String brokerName;
    private Long userId;
    private boolean valid;
}
