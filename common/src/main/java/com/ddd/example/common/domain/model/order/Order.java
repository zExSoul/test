package com.ddd.example.common.domain.model.order;

import com.ddd.example.common.domain.model.OrderId;
import com.ddd.example.common.domain.model.TenantId;
import com.ddd.example.common.domain.model.entity.Entity;

/**
 * 订单实体
 *
 * @author : xuyifan
 * @since : 24/12/2018 7:58 PM
 */
public class Order extends Entity<OrderId> {
    private static final long serialVersionUID = 957231021101192722L;

    private OrderId orderId;
    private Supplier supplier;
    private Operator operator;

    private TenantId tenantId;

    @Override
    protected boolean sameIdAs(OrderId otherId) {
        return otherId.equals(orderId);
    }
}
