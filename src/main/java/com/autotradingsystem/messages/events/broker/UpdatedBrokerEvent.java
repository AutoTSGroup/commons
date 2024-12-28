package com.autotradingsystem.messages.events.broker;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UpdatedBrokerEvent {

  private final UUID brokerId;
  private final String brokerName;
  private final Long userId;
  private final boolean valid;
}
