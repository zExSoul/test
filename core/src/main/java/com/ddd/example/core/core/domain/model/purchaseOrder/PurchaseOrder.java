package com.ddd.example.core.core.domain.model.purchaseOrder;

import com.ddd.example.common.domain.model.order.Order;
import com.ddd.example.common.domain.model.order.OrderState;
import com.ddd.example.common.domain.model.order.PurchaseContract;
import com.ddd.example.common.domain.model.order.address.DeliveryAddress;

import java.util.Date;

/**
 * @author : xuyifan
 * @since : 24/12/2018 10:58 PM
 */
public class PurchaseOrder extends Order {
    private static final long serialVersionUID = 3511824426394997078L;

    private PurchaseContract purchaseContract;
    private DeliveryAddress deliveryAddress;
    private PurchaseOrderExtra extra;
    private Date expectTradeDate;
    private String remark;

    private OrderState orderState;

}
