package com.autotradingsystem.messages.commands.user;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Builder
@Data
public class DisAttachBrokerToUserCommand {

    @TargetAggregateIdentifier
    private Long userId;
    private UUID brokerId;

}
