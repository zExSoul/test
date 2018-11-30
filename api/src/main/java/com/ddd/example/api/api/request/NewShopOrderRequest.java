package com.ddd.example.api.api.request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Author xuyifan
 * Date on 8/11/2018 6:07 PM
 */
@Data
public class NewShopOrderRequest implements Serializable {

    private static final long serialVersionUID = 1856177757397143294L;

    private Long supplierId;
    private Long buyerId;
    private BigDecimal amount;

}
