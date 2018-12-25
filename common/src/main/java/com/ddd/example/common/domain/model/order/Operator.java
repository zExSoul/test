package com.ddd.example.common.domain.model.order;

import com.ddd.example.common.domain.model.entity.Entity;

/**
 * 操作人实体
 *
 * @author : xuyifan
 * @since : 24/12/2018 8:57 PM
 */
public class Operator extends Entity<Long> {
    private static final long serialVersionUID = -5255156011093933870L;

    private Long operatorId;
    private String operatorName;

    public Operator(Long operatorId, String operatorName) {
        super();

        notNull(operatorId, "");

        this.operatorId = operatorId;
        this.operatorName = operatorName;
    }

    public Long operatorId() {
        return operatorId;
    }

    public String operatorName() {
        return operatorName;
    }

    @Override
    protected boolean sameIdAs(Long otherId) {
        return false;
    }
}
