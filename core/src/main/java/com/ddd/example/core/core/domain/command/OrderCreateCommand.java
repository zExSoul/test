package com.ddd.example.core.core.domain.command;

import com.ddd.example.core.core.domain.Purchase;
import com.ddd.example.core.core.domain.Supplier;
import com.ddd.example.common.validate.Validate;
import lombok.Getter;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.math.BigDecimal;

/**
 * Author xuyifan
 * Date on 16/11/2018 10:37 PM
 */
public class OrderCreateCommand implements Command {

    @Getter
    @TargetAggregateIdentifier
    private String orderId;
    @Getter
    private Supplier supplier;
    @Getter
    private Purchase purchase;
    @Getter
    private BigDecimal amount;

    public OrderCreateCommand(final String orderId,
                              final Supplier supplier,
                              final Purchase purchase,
                              final BigDecimal amount) {
        Validate.notBlank(orderId, "orderId.not.blank");
        Validate.notNull(supplier, "supplierId.not.null");
        Validate.notNull(purchase, "buyerId.not.null");
        Validate.notNull(amount, "amount.not.null");

        this.orderId = orderId;
        this.supplier = supplier;
        this.purchase = purchase;
        this.amount = amount;
    }

}
