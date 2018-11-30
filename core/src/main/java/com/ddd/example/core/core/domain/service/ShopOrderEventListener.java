package com.ddd.example.core.core.domain.service;

import com.ddd.example.core.core.domain.event.OrderCreateEvent;

/**
 * Author xuyifan
 * Date on 16/11/2018 11:21 PM
 */
public interface ShopOrderEventListener {

    void on(OrderCreateEvent orderCreateEvent);

}
