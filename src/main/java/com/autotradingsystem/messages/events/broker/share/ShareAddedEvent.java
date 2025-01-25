package com.autotradingsystem.messages.events.broker.share;

import com.autotradingsystem.messages.dto.ShareDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShareAddedEvent {

    private UUID brokerId;
    private ShareDto share;

}
