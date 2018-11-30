package com.ddd.example.core.core.domain.factory.sale;

import com.ddd.example.core.core.domain.Order;
import com.ddd.example.core.core.domain.sale.ShopOrder;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author xuyifan
 * Date on 17/11/2018 9:24 AM
 */
@Component
public class ShopOrderFactory implements AbstractOrderFactory {

    private final CommandGateway commandGateway;

    @Autowired
    public ShopOrderFactory(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends Order> T getOrder() {
        return (T) new ShopOrder(commandGateway);
    }

}
