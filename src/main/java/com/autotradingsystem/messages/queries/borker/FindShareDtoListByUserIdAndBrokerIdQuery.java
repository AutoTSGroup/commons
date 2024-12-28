package com.autotradingsystem.messages.queries.borker;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FindShareDtoListByUserIdAndBrokerIdQuery {

  private Long userId;
  private UUID brokerId;

}
