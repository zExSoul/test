package com.ddd.example.core.core.facade.impl;

import com.ddd.example.api.api.dto.ShopOrderDTO;
import com.ddd.example.api.api.facade.ShopOrderFacade;
import com.ddd.example.api.api.request.NewShopOrderRequest;
import com.ddd.example.core.core.domain.command.OrderCreateCommand;
import com.ddd.example.core.core.domain.factory.sale.ShopOrderFactory;
import com.ddd.example.core.core.domain.sale.ShopOrder;
import com.ddd.example.core.core.domain.service.ShopOrderQueryService;
import com.ddd.example.core.core.model.OrderPO;
import io.terminus.boot.rpc.common.annotation.RpcProvider;
import io.terminus.common.exception.JsonResponseException;
import io.terminus.common.exception.ServiceException;
import io.terminus.common.model.Response;
import io.terminus.cp.common.utils.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Author xuyifan
 * Date on 8/11/2018 6:08 PM
 */
@Service
@RpcProvider
public class ShopOrderFacadeImpl implements ShopOrderFacade {

    private final ShopOrderQueryService shopOrderService;
    private final ShopOrderFactory shopOrderFactory;

    @Autowired
    public ShopOrderFacadeImpl(ShopOrderQueryService shopOrderService,
                               ShopOrderFactory shopOrderFactory) {
        this.shopOrderService = shopOrderService;
        this.shopOrderFactory = shopOrderFactory;
    }

    @Override
    public Response<Void> createShopOrder(NewShopOrderRequest request) {
        OrderCreateCommand command = new OrderCreateCommand(
                UUID.randomUUID().toString(),
                request.getSupplierId(),
                request.getBuyerId(),
                request.getAmount());
        ShopOrder shopOrder = shopOrderFactory.getOrder();
        try {
            shopOrder.send(command);
        } catch (JsonResponseException e) {
            throw new ServiceException(e.getMessage());
        }
        return Response.ok();
    }

    @Override
    public Response<ShopOrderDTO> getShopOrder(String orderId) {
        OrderPO shopOrder;
        try {
            shopOrder = shopOrderService.findOneById(orderId);
        } catch (ServiceException e) {
            throw new JsonResponseException(e.getMessage());
        }
        ShopOrderDTO shopOrderDTO = new ShopOrderDTO();
        BeanUtils.copyProperties(shopOrder, shopOrderDTO);
        return Response.ok(shopOrderDTO);
    }

    @Override
    public Response<List<ShopOrderDTO>> getShopOrders(List<String> orderIds) {
        List<OrderPO> shopOrders;
        try {
            shopOrders = shopOrderService.findAll(orderIds);
        } catch (ServiceException e) {
            throw new ServiceException(e.getMessage());
        }
        List<ShopOrderDTO> shopOrderDTOs =
                BeanUtil.copyListElementsProperties(shopOrders, ShopOrderDTO.class);
        return Response.ok(shopOrderDTOs);
    }

    @Override
    public Response<List<ShopOrderDTO>> getShopOrders() {
        List<OrderPO> shopOrders;
        try {
            shopOrders = shopOrderService.findAll();
        } catch (ServiceException e) {
            throw new ServiceException(e.getMessage());
        }
        List<ShopOrderDTO> shopOrderDTOs =
                BeanUtil.copyListElementsProperties(shopOrders, ShopOrderDTO.class);
        return Response.ok(shopOrderDTOs);
    }

}
