package com.ddd.example.core.core.domain.command;

import com.ddd.example.infrastructure.util.Validate;
import lombok.Getter;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.math.BigDecimal;

/**
 * Author xuyifan
 * Date on 16/11/2018 10:37 PM
 */
public class OrderCreateCommand {

    @Getter
    @TargetAggregateIdentifier
    private String orderId;
    @Getter
    private Long supplierId;
    @Getter
    private Long buyerId;
    @Getter
    private BigDecimal amount;

    public OrderCreateCommand(final String orderId,
                              final Long supplierId,
                              final Long buyerId,
                              final BigDecimal amount) {
        Validate.notBlank(orderId, "orderId.not.blank");
        Validate.notNull(supplierId, "supplierId.not.null");
        Validate.notNull(buyerId, "buyerId.not.null");
        Validate.notNull(amount, "amount.not.null");

        this.orderId = orderId;
        this.supplierId = supplierId;
        this.buyerId = buyerId;
        this.amount = amount;
    }

}
