package com.autotradingsystem.messages.events.broker.share;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ShareRemovedEvent {

  private final UUID brokerId;
  private String figi;

}
