package com.ddd.example.common.domain.model.entity;

import com.ddd.example.common.validate.Validate;

/**
 * Author xuyifan
 * Date on 7/11/2018 5:21 PM
 */
public abstract class Entity<T> extends Validate {

    private static final long serialVersionUID = 1L;

    public Entity() {
        super();
    }

    abstract protected boolean sameIdAs(T otherId);

}
