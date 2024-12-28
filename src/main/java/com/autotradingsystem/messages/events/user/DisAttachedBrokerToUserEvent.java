package com.autotradingsystem.messages.events.user;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DisAttachedBrokerToUserEvent {

  private final Long userId;
  private final UUID brokerId;

}
