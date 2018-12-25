package com.ddd.example.core.core.infrastructure;

import com.ddd.example.core.core.repository.ShopOrderRepo;
import io.terminus.common.mysql.dao.MyBatisDao;

/**
 * @author : xuyifan
 * @since : 24/12/2018 9:18 PM
 */
public class MyBatisPurchaseOrderRepository
        extends MyBatisDao implements ShopOrderRepo {

    @Override
    public void save() {

    }

}
