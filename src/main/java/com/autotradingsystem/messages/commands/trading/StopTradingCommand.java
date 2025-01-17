package com.autotradingsystem.messages.commands.trading;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Builder
@Data
public class StopTradingCommand {

    @TargetAggregateIdentifier
    private final UUID tradingId;
}
