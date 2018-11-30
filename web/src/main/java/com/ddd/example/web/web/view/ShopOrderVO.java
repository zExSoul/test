package com.ddd.example.web.web.view;

import com.ddd.example.api.api.dto.ShopSkuOrderDTO;
import com.ddd.example.infrastructure.model.ValueObject;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Author xuyifan
 * Date on 8/11/2018 11:13 PM
 */
@Data
public class ShopOrderVO implements ValueObject {

    private String orderId;
    private Long supplierId;
    private Long buyerId;
    private BigDecimal amount;
    private Date createDate;
    private Date tradeDate;
    private String supplierName;
    private String BuyerName;
    private List<ShopSkuOrderDTO> shopSkuOrders;
    // 地区...

    @Override
    public boolean sameValueAs(Object other) {
        return false;
    }
}
