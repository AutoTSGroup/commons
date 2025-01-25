package com.autotradingsystem.messages.events.broker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedBrokerEvent {

    private UUID brokerId;
    private String token;
    private Long userId;
    private String brokerName;
    private boolean valid;
}
