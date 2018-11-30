package com.ddd.example.core.core.domain.factory.sale;

import com.ddd.example.core.core.domain.Order;

/**
 * Author xuyifan
 * Date on 16/11/2018 10:19 PM
 */
public interface AbstractOrderFactory {

    <T extends Order> T getOrder();

}
