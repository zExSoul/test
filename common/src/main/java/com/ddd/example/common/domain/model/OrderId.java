package com.ddd.example.common.domain.model;

/**
 * Author xuyifan
 * Date on 24/12/2018 7:51 PM
 */
public class OrderId extends AbstractId {
    private static final long serialVersionUID = -1L;

    @Override
    protected void validateId(String anId) {
        // 特殊校验逻辑
    }
}
