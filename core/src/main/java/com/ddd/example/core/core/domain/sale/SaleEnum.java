package com.ddd.example.core.core.domain.sale;

import com.ddd.example.infrastructure.model.Enum;

/**
 * Author xuyifan
 * Date on 7/11/2018 11:00 PM
 */
public class SaleEnum {

    public static class PayStatus extends Enum<Integer, String> {
        public final static PayStatus PAYINFO = new PayStatus(1, "未支付");
        public final static PayStatus PAYSUCCESS = new PayStatus(10, "支付成功");
        public final static PayStatus PAYFAIL = new PayStatus(-10, "支付失败");

        public PayStatus(Integer value, String name) {
            super(value, name);
        }
    }

    public static class FlowStatus extends Enum<Integer, String> {
        public final static FlowStatus CREATE = new FlowStatus(1, "创建");
        public final static FlowStatus FINISHED = new FlowStatus(10, "完成");
        public final static FlowStatus CANCEL = new FlowStatus(-10, "已取消");

        public FlowStatus(Integer value, String name) {
            super(value, name);
        }
    }
}
