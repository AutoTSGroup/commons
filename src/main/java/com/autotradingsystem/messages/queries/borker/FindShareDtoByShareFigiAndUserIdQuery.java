package com.autotradingsystem.messages.queries.borker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FindShareDtoByShareFigiAndUserIdQuery {

    private String shareFigi;
    private Long userId;

}
