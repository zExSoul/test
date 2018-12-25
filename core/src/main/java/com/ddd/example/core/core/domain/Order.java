package com.ddd.example.core.core.domain;

import com.ddd.example.common.domain.model.entity.Entity;
import lombok.Getter;
import org.axonframework.commandhandling.gateway.CommandGateway;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Author xuyifan
 * Date on 7/11/2018 5:48 PM
 */
public class Order implements Entity<Order> {

    @Id
    @Getter
    protected String orderId;
    @Getter
    protected Supplier supplier;
    @Getter
    protected Purchase purchase;
    @Getter
    protected List<OrderItem> orderItems;
    @Getter
    protected BigDecimal amount;
    @Getter
    protected Date createDate;
    @Getter
    protected Date tradeDate;
    @Getter
    protected CommandGateway commandGateway;

    @Override
    public boolean sameIdAs(Order other) {
        return false;
    }
}
