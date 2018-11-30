package com.ddd.example.core.core.domain.service.impl;

import com.ddd.example.core.core.domain.service.ShopOrderQueryService;
import com.ddd.example.core.core.model.OrderPO;
import com.ddd.example.core.core.repository.ShopOrderRepo;
import io.terminus.common.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author xuyifan
 * Date on 8/11/2018 9:16 AM
 */
@Slf4j
@Service
public class ShopOrderQueryServiceImpl implements ShopOrderQueryService {

    private final ShopOrderRepo shopOrderRepo;

    @Autowired
    public ShopOrderQueryServiceImpl(ShopOrderRepo shopOrderRepo) {
        this.shopOrderRepo = shopOrderRepo;
    }

    @Override
    public OrderPO findOneById(String orderId) {
        try {
            log.info("findOneById: orderId:{}", orderId);
            return shopOrderRepo.findOne(orderId);
        } catch (Exception e) {
            throw new ServiceException("find.fail");
        }
    }

    @Override
    public List<OrderPO> findAll() {
        try {
            log.info("findAll:");
            return shopOrderRepo.findAll();
        } catch (Exception e) {
            throw new ServiceException("find.fail");
        }
    }

    @Override
    public List<OrderPO> findAll(List<String> orderIds) {
        try {
            log.info("findAll: orderIds:{}", orderIds);
            return shopOrderRepo.findAll(orderIds);
        } catch (Exception e) {
            throw new ServiceException("find.fail");
        }
    }

}
