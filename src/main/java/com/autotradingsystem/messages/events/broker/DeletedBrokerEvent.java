package com.autotradingsystem.messages.events.broker;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DeletedBrokerEvent {

  private final UUID brokerId;
}
