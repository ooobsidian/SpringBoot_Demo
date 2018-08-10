package com.obsidian.sell.dao;

import com.obsidian.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-10 23:50
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);
}
