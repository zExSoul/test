package com.ddd.example.core.core.domain.sale;

import com.ddd.example.core.core.domain.TradePart;
import com.ddd.example.infrastructure.util.Validate;
import lombok.Getter;

/**
 * Author xuyifan
 * Date on 7/11/2018 10:24 PM
 */
public class Purchase extends TradePart {

    @Getter
    protected ReceiveAddress receiveAddress;

    public Purchase(final Long id,
                    final String name,
                    final ReceiveAddress receiveAddress) {
        Validate.notNull(id, "缺少编号");
        Validate.notBlank(name, "缺少姓名");
        Validate.notNull(receiveAddress, "缺少地址");

        this.id = id;
        this.name = name;


    }

    @Override
    public boolean sameValueAs(TradePart other) {
        return false;
    }
}
