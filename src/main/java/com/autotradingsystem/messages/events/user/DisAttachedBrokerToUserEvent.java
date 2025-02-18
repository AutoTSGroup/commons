package com.autotradingsystem.messages.events.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
public class DisAttachedBrokerToUserEvent {

    private Long userId;
    private UUID brokerId;

}
