package com.ddd.example.core.core.domain;

import com.ddd.example.common.domain.model.vo.ValueObject;
import lombok.Value;

/**
 * Author xuyifan
 * Date on 7/11/2018 10:21 PM
 */
@Value
public class Supplier implements ValueObject<Supplier> {

    private Long id;
    private String name;
    private Address address;

    public Supplier(final Long id,
                    final String name,
                    final Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean sameValueAs(Supplier other) {
        return false;
    }
}
