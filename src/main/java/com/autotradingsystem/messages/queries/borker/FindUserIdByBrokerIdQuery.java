package com.autotradingsystem.messages.queries.borker;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FindUserIdByBrokerIdQuery {

  private UUID brokerId;

}
