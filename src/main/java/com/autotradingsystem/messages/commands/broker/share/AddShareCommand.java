package com.autotradingsystem.messages.commands.broker.share;

import com.autotradingsystem.messages.dto.ShareDto;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Builder
@Data
public class AddShareCommand {

    @TargetAggregateIdentifier
    private UUID brokerId;
    private ShareDto share;

}
