package com.ddd.example.web.web.controller;

import com.ddd.example.api.api.dto.ShopOrderDTO;
import com.ddd.example.api.api.facade.ShopOrderFacade;
import com.ddd.example.api.api.request.NewShopOrderRequest;
import com.ddd.example.infrastructure.util.Validate;
import io.terminus.boot.rpc.common.annotation.RpcConsumer;
import io.terminus.common.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author xuyifan
 * Date on 8/11/2018 7:13 PM
 */
@RestController
@RequestMapping("/api/test")
public class ShopOrderController {

    @RpcConsumer
    private ShopOrderFacade shopOrderFacade;

    @PostMapping("/create")
    public Boolean createShopOrder(NewShopOrderRequest request) {
        shopOrderFacade.createShopOrder(request);
        return Boolean.TRUE;
    }

    @GetMapping("/list")
    public List<ShopOrderDTO> listShopOrders(List<String> orderIds) {
        Response<List<ShopOrderDTO>> response = shopOrderFacade.getShopOrders(orderIds);
        Validate.isTrue(response.isSuccess(), "find.fail");
        return response.getResult();
    }

    @GetMapping("/all")
    public List<ShopOrderDTO> listShopOrders() {
        Response<List<ShopOrderDTO>> response = shopOrderFacade.getShopOrders();
        Validate.isTrue(response.isSuccess(), "find.fail");
        return response.getResult();
    }

    @GetMapping("/detail")
    public ShopOrderDTO getShopOrderDetail(String orderId) {
        Response<ShopOrderDTO> response = shopOrderFacade.getShopOrder(orderId);
        Validate.isTrue(response.isSuccess(), "find.fail");
        return response.getResult();
    }

}
