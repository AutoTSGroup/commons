package com.autotradingsystem.messages.events.broker;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class DeletedBrokerEvent {

    private final UUID brokerId;
}
