package com.autotradingsystem.messages.events.broker;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class CreatedBrokerEvent {

    private final UUID brokerId;
    private final String token;
    private final Long userId;
    private final String brokerName;
    private final boolean valid;
}
