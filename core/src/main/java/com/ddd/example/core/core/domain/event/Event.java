package com.ddd.example.core.core.domain.event;

import lombok.Getter;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.math.BigDecimal;

/**
 * Author xuyifan
 * Date on 16/11/2018 11:30 PM
 */
public class Event {

    @Getter
    @TargetAggregateIdentifier
    protected String orderId;
    @Getter
    protected Long supplierId;
    @Getter
    protected Long buyerId;
    @Getter
    protected BigDecimal amount;

}
