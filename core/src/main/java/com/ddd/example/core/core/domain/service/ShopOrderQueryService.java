package com.ddd.example.core.core.domain.service;

import com.ddd.example.core.core.model.OrderPO;

import java.util.List;

/**
 * Author xuyifan
 * Date on 8/11/2018 9:15 AM
 */
public interface ShopOrderQueryService {

    OrderPO findOneById(final String orderId);

    List<OrderPO> findAll();

    List<OrderPO> findAll(List<String> orderIds);

}
