package com.autotradingsystem.messages.commands.user;


import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Builder
@Data
public class CreateUserCommand {

  @TargetAggregateIdentifier
  private Long userId;
  private String username;
  private String firstName;
  private String lastName;
  private String phoneNumber;
}
