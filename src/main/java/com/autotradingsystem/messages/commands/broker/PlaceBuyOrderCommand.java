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
@NoArgsConstructor
public class PlaceBuyOrderCommand {

    @TargetAggregateIdentifier
    private UUID brokerId;
    private String figi;
    private BigDecimal expetedAmount;
    private Long timestamp;
}
