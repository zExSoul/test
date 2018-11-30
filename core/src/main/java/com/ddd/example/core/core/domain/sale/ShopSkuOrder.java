package com.ddd.example.core.core.domain.sale;

import com.ddd.example.core.core.domain.SkuOrder;

/**
 * Author xuyifan
 * Date on 7/11/2018 9:51 PM
 */
public class ShopSkuOrder extends SkuOrder {

    public ShopSkuOrder(){

    }

    @Override
    public boolean sameValueAs(SkuOrder other) {
        return other != null && other.equals(this);
    }

}
