package com.autotradingsystem.messages.events.broker.share;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class ShareRemovedEvent {

    private final UUID brokerId;
    private String figi;

}
