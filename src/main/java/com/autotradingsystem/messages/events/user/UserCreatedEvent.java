package com.autotradingsystem.messages.events.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreatedEvent {

    private Long userId;
    private String username;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
