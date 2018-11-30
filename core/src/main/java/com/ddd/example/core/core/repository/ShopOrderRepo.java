package com.ddd.example.core.core.repository;

import com.ddd.example.core.core.model.OrderPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author xuyifan
 * Date on 16/11/2018 10:50 PM
 */
public interface ShopOrderRepo extends JpaRepository<OrderPO, String> {
}
