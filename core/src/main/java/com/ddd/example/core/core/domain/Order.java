package com.ddd.example.core.core.domain;

import com.ddd.example.infrastructure.model.Entity;
import lombok.Getter;
import org.axonframework.commandhandling.gateway.CommandGateway;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Author xuyifan
 * Date on 7/11/2018 5:48 PM
 */
public abstract class Order implements Entity<Order> {

    @Id
    @Getter
    protected String orderId;
    @Getter
    protected Long supplierId;
    @Getter
    protected Long buyerId;
    @Getter
    protected BigDecimal amount;
    @Getter
    protected Date createDate;
    @Getter
    protected Date tradeDate;
    @Getter
    protected CommandGateway commandGateway;

}
