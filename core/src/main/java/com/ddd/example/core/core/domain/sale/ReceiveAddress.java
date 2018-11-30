package com.ddd.example.core.core.domain.sale;

import com.ddd.example.core.core.domain.Address;
import lombok.Data;

/**
 * Author xuyifan
 * Date on 7/11/2018 10:00 PM
 */
@Data
public class ReceiveAddress extends Address {


    private String receiveName;
    private String mobile;
    private String email;

    @Override
    public boolean sameValueAs(Address other) {
        return other != null && other.equals(this);
    }
}
