package com.autotradingsystem.messages.commands.user;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserCommand {

    @TargetAggregateIdentifier
    private Long userId;
    private String username;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
