package com.ddd.example.core.core.domain;

import com.ddd.example.common.domain.model.vo.ValueObject;
import lombok.Value;

/**
 * Author xuyifan
 * Date on 3/12/2018 1:57 PM
 */
@Value
public class Purchase implements ValueObject<Purchase> {

    private Long id;
    private String name;
    private Address address;

    public Purchase(final Long id,
                    final String name,
                    final Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean sameValueAs(Purchase other) {
        return false;
    }
}
