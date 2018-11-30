package com.ddd.example.core.core.domain;

import com.ddd.example.infrastructure.model.ValueObject;
import lombok.Getter;

/**
 * Author xuyifan
 * Date on 7/11/2018 10:21 PM
 */
public abstract class TradePart implements ValueObject<TradePart> {

    @Getter
    protected Long id;
    @Getter
    protected String name;

}
