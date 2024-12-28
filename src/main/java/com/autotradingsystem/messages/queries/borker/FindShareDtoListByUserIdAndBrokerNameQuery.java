package com.autotradingsystem.messages.queries.borker;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FindShareDtoListByUserIdAndBrokerNameQuery {

  private Long userId;
  private String brokerName;

}
