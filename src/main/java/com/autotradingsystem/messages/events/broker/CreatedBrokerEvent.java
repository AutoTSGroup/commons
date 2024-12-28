package com.autotradingsystem.messages.events.broker;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreatedBrokerEvent {

  private final UUID brokerId;
  private final String token;
  private final Long userId;
  private final String brokerName;
  private final boolean valid;
}
