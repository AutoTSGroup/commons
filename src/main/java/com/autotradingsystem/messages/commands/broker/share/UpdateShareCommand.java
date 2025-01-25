package com.autotradingsystem.messages.commands.broker.share;

import com.autotradingsystem.messages.dto.ShareDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateShareCommand {

    @TargetAggregateIdentifier
    private UUID brokerId;
    private ShareDto shareDto;

}
