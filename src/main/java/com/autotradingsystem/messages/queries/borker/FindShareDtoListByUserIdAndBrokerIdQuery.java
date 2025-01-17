package com.autotradingsystem.messages.queries.borker;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class FindShareDtoListByUserIdAndBrokerIdQuery {

    private Long userId;
    private UUID brokerId;

}
