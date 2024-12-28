package com.autotradingsystem.messages.queries.borker;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FindShareIdByBrokerIdQuery {

  private UUID brokerId;

}
