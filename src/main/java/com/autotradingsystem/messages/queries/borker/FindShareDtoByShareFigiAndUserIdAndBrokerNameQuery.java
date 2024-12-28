package com.autotradingsystem.messages.queries.borker;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FindShareDtoByShareFigiAndUserIdAndBrokerNameQuery {

  private String shareFigi;
  private Long userId;
  private String brokerName;

}
