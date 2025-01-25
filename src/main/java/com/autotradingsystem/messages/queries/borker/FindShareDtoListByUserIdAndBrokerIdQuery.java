package com.autotradingsystem.messages.queries.borker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FindShareDtoListByUserIdAndBrokerIdQuery {

    private Long userId;
    private UUID brokerId;

}
