package com.autotradingsystem.messages.events.broker.share;

import com.autotradingsystem.messages.dto.ShareDto;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ShareUpdatedEvent {

  private final UUID brokerId;
  private final ShareDto updatedShare;
}
