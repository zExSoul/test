package com.ddd.example.infrastructure.model;

/**
 * Author xuyifan
 * Date on 7/11/2018 5:21 PM
 */
public interface Entity<T> {

    boolean sameIdAs(T other);

}
