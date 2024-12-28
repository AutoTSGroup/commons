package com.autotradingsystem.messages.events.broker.share;

import com.autotradingsystem.messages.dto.ShareDto;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ShareAddedEvent {

  private UUID brokerId;
  private ShareDto share;

}
