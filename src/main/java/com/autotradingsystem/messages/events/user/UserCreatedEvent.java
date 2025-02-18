package com.autotradingsystem.messages.events.user;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserCreatedEvent {

    private Long userId;
    private String username;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
