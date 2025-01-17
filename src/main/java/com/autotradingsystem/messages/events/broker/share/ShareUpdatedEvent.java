package com.autotradingsystem.messages.events.broker.share;

import com.autotradingsystem.messages.dto.ShareDto;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class ShareUpdatedEvent {

    private final UUID brokerId;
    private final ShareDto updatedShare;
}
