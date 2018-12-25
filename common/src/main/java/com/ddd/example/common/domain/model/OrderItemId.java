package com.ddd.example.common.domain.model;

/**
 * @author : xuyifan
 * @since : 24/12/2018 8:41 PM
 */
public class OrderItemId extends AbstractId {
    private static final long serialVersionUID = -1L;

    @Override
    protected void validateId(String anId) {
        // 特殊校验逻辑
    }
}
