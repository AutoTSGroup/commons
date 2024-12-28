package com.autotradingsystem.messages.events.user;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserCreatedEvent {

  private final Long userId;
  private final String username;
  private final String firstName;
  private final String lastName;
  private final String phoneNumber;
}
