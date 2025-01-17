package com.autotradingsystem.messages.commands.trading;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;
import java.util.UUID;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder
@Data
public class StartTradingCommand {

    @TargetAggregateIdentifier
    private UUID tradingId;
    private UUID brokerId;
    private Long userId;
    private String figi;
    private String name;
    private BigDecimal amount;
    private String tradingStrategy;

}
