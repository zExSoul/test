package com.ddd.example.api.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Author xuyifan
 * Date on 8/11/2018 5:56 PM
 */
@Data
public class ShopOrderDTO implements Serializable {

    private static final long serialVersionUID = 7290120668036589593L;

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

}
