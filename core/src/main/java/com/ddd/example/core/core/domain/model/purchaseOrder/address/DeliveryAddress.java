package com.ddd.example.core.core.domain.model.purchaseOrder.address;

import com.ddd.example.common.domain.model.order.address.Address;
import com.ddd.example.common.domain.model.order.address.AddressType;
import com.ddd.example.common.domain.model.vo.ValueObject;

/**
 * @author : xuyifan
 * @since : 24/12/2018 8:45 PM
 */
public class DeliveryAddress extends ValueObject {

    private AddressType addressType;
    private String receiveName;
    private String receivePhone;
    private Address address;

    public DeliveryAddress(AddressType addressType,
                           String receiveName,
                           String receivePhone,
                           Address address) {
        super();

        notNull(addressType, "");

        // 特殊检验

        this.addressType = addressType;
        this.receiveName = receiveName;
        this.receivePhone = receivePhone;
        this.address = address;
    }
}
