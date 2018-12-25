package com.ddd.example.common.domain.model.order;

import com.ddd.example.common.domain.model.entity.Entity;

/**
 * 采购合同实体
 *
 * @author : xuyifan
 * @since : 24/12/2018 9:07 PM
 */
public class PurchaseContract extends Entity<Long> {
    private static final long serialVersionUID = 6194989060121977124L;

    private Long purchaseContractId;
    private String purchaseContractName;

    // 略

    @Override
    protected boolean sameIdAs(Long otherId) {
        return false;
    }
}
