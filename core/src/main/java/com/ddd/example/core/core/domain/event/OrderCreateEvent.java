package com.ddd.example.core.core.domain.event;

import com.ddd.example.core.core.domain.Purchase;
import com.ddd.example.core.core.domain.Supplier;
import com.ddd.example.common.validate.Validate;
import lombok.Getter;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.math.BigDecimal;

/**
 * Author xuyifan
 * Date on 16/11/2018 10:39 PM
 */
public class OrderCreateEvent implements Event {

    @Getter
    @TargetAggregateIdentifier
    protected String orderId;
    @Getter
    protected Supplier supplier;
    @Getter
    protected Purchase purchase;
    @Getter
    protected BigDecimal amount;

    public OrderCreateEvent(final String orderId,
                            final Supplier supplier,
                            final Purchase purchase,
                            final BigDecimal amount) {
        Validate.notBlank(orderId, "orderId.not.blank");
        // todo validate

        this.orderId = orderId;
        this.supplier = supplier;
        this.purchase = purchase;
        this.amount = amount;
    }

}
