package com.autotradingsystem.messages.commands.trading;

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
public class StopTradingCommand {

    @TargetAggregateIdentifier
    private UUID tradingId;
}
