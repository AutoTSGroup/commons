package com.autotradingsystem.messages.commands.broker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class PlaceSellOrderCommand {

    @TargetAggregateIdentifier
    private final UUID tradingId;
    private final String figi;
    private final BigDecimal amount;

}
