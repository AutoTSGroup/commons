package com.autotradingsystem.messages.events.user;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class DisAttachedBrokerToUserEvent {

    private final Long userId;
    private final UUID brokerId;

}
