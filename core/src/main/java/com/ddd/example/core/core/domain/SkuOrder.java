package com.ddd.example.core.core.domain;

import com.ddd.example.infrastructure.model.ValueObject;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Author xuyifan
 * Date on 7/11/2018 9:23 PM
 */
public abstract class SkuOrder implements ValueObject<SkuOrder> {

    @Getter
    @Setter
    protected String orderId;
    @Getter
    @Setter
    protected Long itemId;
    @Getter
    @Setter
    protected String itemName;
    @Getter
    @Setter
    protected String itemCode;
    @Getter
    @Setter
    protected String itemSpecification;
    @Getter
    @Setter
    protected Long quantity;
    @Getter
    @Setter
    protected BigDecimal price;

}
