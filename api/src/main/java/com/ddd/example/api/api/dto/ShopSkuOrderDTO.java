package com.ddd.example.api.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Author xuyifan
 * Date on 8/11/2018 6:02 PM
 */
@Data
public class ShopSkuOrderDTO implements Serializable {

    private static final long serialVersionUID = 8903838692696203216L;

    protected String orderId;
    protected Long itemId;
    protected String itemName;
    protected String itemCode;
    protected String itemSpecification;
    protected Long quantity;
    protected BigDecimal price;

}
