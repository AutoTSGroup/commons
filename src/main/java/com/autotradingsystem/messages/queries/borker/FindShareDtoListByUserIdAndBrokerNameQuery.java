package com.autotradingsystem.messages.queries.borker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindShareDtoListByUserIdAndBrokerNameQuery {

    private Long userId;
    private String brokerName;

}
