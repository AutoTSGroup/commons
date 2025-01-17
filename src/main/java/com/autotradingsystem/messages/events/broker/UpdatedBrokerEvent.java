package com.autotradingsystem.messages.events.broker;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class UpdatedBrokerEvent {

    private final UUID brokerId;
    private final String brokerName;
    private final Long userId;
    private final boolean valid;
}
