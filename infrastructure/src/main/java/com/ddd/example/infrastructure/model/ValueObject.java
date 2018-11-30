package com.ddd.example.infrastructure.model;

/**
 * Author xuyifan
 * Date on 7/11/2018 8:50 PM
 */
public interface ValueObject<T> {

    boolean sameValueAs(T other);

}
