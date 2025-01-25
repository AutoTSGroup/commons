package com.autotradingsystem.messages.commands.user;

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
public class AttachBrokerToUserCommand {

    @TargetAggregateIdentifier
    private Long userId;
    private UUID brokerId;

}
