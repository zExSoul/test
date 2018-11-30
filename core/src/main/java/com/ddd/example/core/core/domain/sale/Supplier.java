package com.ddd.example.core.core.domain.sale;

import com.ddd.example.core.core.domain.TradePart;
import com.ddd.example.infrastructure.util.Validate;

/**
 * Author xuyifan
 * Date on 7/11/2018 10:24 PM
 */
public class Supplier extends TradePart {

    public Supplier(final Long id,
             final String name) {
        Validate.notNull(id, "缺少编号");
        Validate.notBlank(name, "缺少姓名");

        this.id = id;
        this.name = name;
    }

    @Override
    public boolean sameValueAs(TradePart other) {
        return false;
    }
}
