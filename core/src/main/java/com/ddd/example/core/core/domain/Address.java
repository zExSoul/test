package com.ddd.example.core.core.domain;

import com.ddd.example.infrastructure.model.ValueObject;
import lombok.Data;

/**
 * Author xuyifan
 * Date on 7/11/2018 9:47 PM
 */
@Data
public abstract class Address implements ValueObject<Address> {

    protected String province;
    protected Long provinceId;
    protected String city;
    protected Long cityId;
    protected String region;
    protected Long regionId;
    protected String street;
    protected Long streetId;
    protected String detail;

}
