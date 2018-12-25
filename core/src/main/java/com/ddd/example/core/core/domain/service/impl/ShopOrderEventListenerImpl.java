package com.ddd.example.core.core.domain.service.impl;

import com.ddd.example.core.core.domain.event.OrderCreateEvent;
import com.ddd.example.core.core.domain.service.ShopOrderEventListener;
import com.ddd.example.core.core.model.OrderPO;
import com.ddd.example.core.core.repository.ShopOrderRepo;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author xuyifan
 * Date on 16/11/2018 11:22 PM
 */
@Service
public class ShopOrderEventListenerImpl implements ShopOrderEventListener {

    private final ShopOrderRepo shopOrderRepo;

    @Autowired
    public ShopOrderEventListenerImpl(ShopOrderRepo shopOrderRepo) {
        this.shopOrderRepo = shopOrderRepo;
    }

    @Override
    @EventHandler
    public void on(OrderCreateEvent orderCreateEvent) {
        OrderPO orderPO = OrderPO.builder()
                .orderId(orderCreateEvent.getOrderId())
                .supplierId(orderCreateEvent.getSupplier().getId())
                .buyerId(orderCreateEvent.getPurchase().getId())
                .amount(orderCreateEvent.getAmount())
                .isDeleted(0)
                .build();
        shopOrderRepo.save(orderPO);
    }
}
