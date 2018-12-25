package com.ddd.example.common.domain.model.order;

import com.ddd.example.common.domain.model.OrderId;
import com.ddd.example.common.domain.model.OrderItemId;
import com.ddd.example.common.domain.model.entity.Entity;

import java.math.BigDecimal;

/**
 * 订单行项目实体
 *
 * @author : xuyifan
 * @since : 24/12/2018 8:41 PM
 */
public class OrderItem extends Entity<OrderItemId> {
    private static final long serialVersionUID = 4205157787211116023L;

    private OrderItemId orderItemId;
    private OrderId orderId;
    private BigDecimal price;

    @Override
    protected boolean sameIdAs(OrderItemId orderItemId) {
        return false;
    }
}
