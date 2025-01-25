package com.autotradingsystem.messages.queries.borker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindShareIdByBrokerIdQuery {

    private UUID brokerId;

}
