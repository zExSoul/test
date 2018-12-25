package com.ddd.example.common.domain.model;

import com.ddd.example.common.validate.Validate;
import lombok.ToString;

import java.io.Serializable;

/**
 * 实体唯一标示
 * <p>
 * Author xuyifan
 * Date on 24/12/2018 7:15 PM
 */
@ToString
public abstract class AbstractId
        extends Validate
        implements Identity, Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @Override
    public String id() {
        return this.id;
    }

    protected AbstractId(String anId) {
        this();

        this.setId(anId);
    }

    protected AbstractId() {
        super();
    }

    private void setId(String anId) {
        this.notBlank(anId, "");

        this.validateId(anId);

        this.id = anId;
    }

    protected abstract void validateId(String anId);

}
