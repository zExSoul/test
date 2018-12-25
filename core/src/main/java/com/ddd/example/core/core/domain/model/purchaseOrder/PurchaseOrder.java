package com.ddd.example.core.core.domain.model.purchaseOrder;

import com.ddd.example.common.domain.model.order.Order;
import com.ddd.example.common.domain.model.order.OrderState;
import com.ddd.example.common.domain.model.order.PurchaseContract;
import com.ddd.example.core.core.domain.model.purchaseOrder.address.DeliveryAddress;

import java.util.Date;
import java.util.List;

/**
 * @author : xuyifan
 * @since : 24/12/2018 10:58 PM
 */
public class PurchaseOrder extends Order {
    private static final long serialVersionUID = 3511824426394997078L;

    private PurchaseContract purchaseContract;
    private DeliveryAddress deliveryAddress;
    private List<ChargeItem> chargeItems;
    private Date expectTradeDate;
    private String remark;
    private PurchaseOrderExtra extra;

    private OrderState orderState;

}
