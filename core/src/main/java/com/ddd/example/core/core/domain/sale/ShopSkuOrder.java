package com.ddd.example.core.core.domain.sale;

import com.ddd.example.core.core.domain.OrderItem;
import com.ddd.example.common.domain.model.vo.ValueObject;
import lombok.*;

import java.math.BigDecimal;

/**
 * Author xuyifan
 * Date on 7/11/2018 9:51 PM
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopSkuOrder implements OrderItem, ValueObject<ShopSkuOrder> {
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

    @Override
    public boolean sameValueAs(ShopSkuOrder other) {
        return false;
    }
}
