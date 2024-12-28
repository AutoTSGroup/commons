package com.autotradingsystem.messages.queries.borker;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FindShareDtoByShareFigiAndUserIdQuery {

  private String shareFigi;
  private Long userId;

}
