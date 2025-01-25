package com.autotradingsystem.messages.events.broker.share;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShareRemovedEvent {

    private UUID brokerId;
    private String figi;

}
