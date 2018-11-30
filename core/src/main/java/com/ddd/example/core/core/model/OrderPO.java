package com.ddd.example.core.core.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Author xuyifan
 * Date on 12/11/2018 8:37 PM
 */
@Builder
@ToString
@Entity(name = "shop_orders")
@Table(name = "shop_orders")
@NoArgsConstructor
@AllArgsConstructor
public class OrderPO implements Serializable {

    private static final long serialVersionUID = -6187860572346684905L;

    /**
     * 主键id
     */
    @Id
    @Getter
    @Setter
    private String orderId;

    /**
     * 采购商 ID
     */
    @Getter
    @Setter
    private Long supplierId;

    @Getter
    @Setter
    private Long buyerId;

    /**
     * 实付价
     */
    @Getter
    @Setter
    private BigDecimal amount;

    /**
     * 状态
     */
    @Getter
    @Setter
    private Integer status;

    /**
     * 订单创建时间
     */
    @Getter
    @Setter
    private Date createdAt;

    /**
     * 订单更新时间
     */
    @Getter
    @Setter
    private Date updatedAt;

    /**
     * 0，非删除
     */
    @Getter
    @Setter
    private Integer isDeleted;

}

