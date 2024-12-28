package com.autotradingsystem.messages.events.user;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AttachedBrokerToUserEvent {

  private final Long userId;
  private final UUID brokerId;

}
