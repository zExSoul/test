package com.ddd.example.api.api.facade;

import com.ddd.example.api.api.dto.ShopOrderDTO;
import com.ddd.example.api.api.request.NewShopOrderRequest;
import io.terminus.common.model.Response;

import java.util.List;

/**
 * Author xuyifan
 * Date on 8/11/2018 5:55 PM
 */
public interface ShopOrderFacade {

    Response<Void> createShopOrder(NewShopOrderRequest request);

    Response<ShopOrderDTO> getShopOrder(String orderId);

    Response<List<ShopOrderDTO>> getShopOrders(List<String> orderIds);

    Response<List<ShopOrderDTO>> getShopOrders();
}
