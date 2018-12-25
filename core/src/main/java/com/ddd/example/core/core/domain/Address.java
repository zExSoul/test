package com.ddd.example.core.core.domain;

import com.ddd.example.common.domain.model.vo.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author xuyifan
 * Date on 7/11/2018 9:47 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements ValueObject<Address> {

    protected String province;
    protected Long provinceId;
    protected String city;
    protected Long cityId;
    protected String region;
    protected Long regionId;
    protected String street;
    protected Long streetId;
    protected String detail;

    @Override
    public boolean sameValueAs(Address other) {
        return false;
    }
}
