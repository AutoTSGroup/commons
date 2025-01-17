package com.autotradingsystem.messages.queries.borker;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class FindShareDtoByBrokerIdAndFigiQuery {

    private UUID brokerId;
    private String figi;

}
