package com.ddd.example.common.domain.model.order;

import com.ddd.example.common.domain.model.entity.Entity;

/**
 * 供应商实体
 * <p>
 * Author xuyifan
 * Date on 24/12/2018 8:13 PM
 */
public class Supplier extends Entity<Long> {
    private static final long serialVersionUID = 7016969549899025554L;

    private Long supplierId;
    private String supplierName;

    private Supplier() {
    }

    public Supplier(Long supplierId, String supplierName) {
        super();

        notNull(supplierId, "");
        notBlank(supplierName, "");

        this.supplierId = supplierId;
        this.supplierName = supplierName;
    }

    public Long id() {
        return supplierId;
    }

    public String supplierName() {
        return supplierName;
    }

    @Override
    protected boolean sameIdAs(Long otherId) {
        return otherId.equals(supplierId);
    }

}
