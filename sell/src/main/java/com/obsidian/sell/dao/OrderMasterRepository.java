package com.obsidian.sell.dao;

import com.obsidian.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-10 23:29
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
