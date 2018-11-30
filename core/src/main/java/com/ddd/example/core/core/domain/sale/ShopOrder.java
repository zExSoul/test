package com.ddd.example.core.core.domain.sale;

import com.ddd.example.core.core.domain.Order;
import com.ddd.example.core.core.domain.command.OrderCreateCommand;
import com.ddd.example.core.core.domain.event.OrderCreateEvent;
import io.terminus.common.exception.JsonResponseException;
import lombok.Getter;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import java.util.List;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;

/**
 * Author xuyifan
 * Date on 7/11/2018 8:48 PM
 */
@Aggregate
public class ShopOrder extends Order {

    @Getter
    private Supplier supplier;
    @Getter
    private Purchase purchase;
    @Getter
    private List<ShopSkuOrder> shopSkuOrders;
    @Getter
    private Status status;

    @SuppressWarnings("unused")
    private ShopOrder() {
    }

    public ShopOrder(final CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @CommandHandler
    public ShopOrder(final OrderCreateCommand command) {
        apply(new OrderCreateEvent(
                command.getOrderId(),
                command.getSupplierId(),
                command.getBuyerId(),
                command.getAmount()));
    }

    @EventSourcingHandler
    protected void on(final OrderCreateEvent event) {
        this.orderId = event.getOrderId();
        this.supplierId = event.getSupplierId();
        this.buyerId = event.getBuyerId();
        this.amount = event.getAmount();
    }

    public void send(Object command) {
        commandGateway.send(command).exceptionally(throwable -> {
            throw new JsonResponseException(throwable.getMessage());
        });
    }

    @Override
    public boolean sameIdAs(Order other) {
        return other != null && other.getOrderId().equals(this.getOrderId());
    }

    private enum Status {
        OPENED {
            @Override
            public Status next() {
                return Status.CANCELED;
            }
        },
        CANCELED {
            @Override
            public Status next() {
                return Status.PAYED;
            }
        },
        PAYED {
            @Override
            public Status next() {
                return Status.COMPLETED;
            }
        },
        COMPLETED {
            @Override
            public Status next() {
                return Status.COMPLETED;
            }
        };

        public abstract Status next();
    }

}
