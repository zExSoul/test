package com.ddd.example.core.core.domain.event;

import com.ddd.example.infrastructure.util.Validate;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * Author xuyifan
 * Date on 16/11/2018 10:39 PM
 */
public class OrderCreateEvent extends Event {

    public OrderCreateEvent(final String orderId,
                            final Long supplierId,
                            final Long buyerIdId,
                            final BigDecimal amount) {
        Validate.notBlank(orderId, "orderId.not.blank");
        // todo validate

        this.orderId = orderId;
        this.supplierId = supplierId;
        this.buyerId = buyerIdId;
        this.amount = amount;
    }

}
