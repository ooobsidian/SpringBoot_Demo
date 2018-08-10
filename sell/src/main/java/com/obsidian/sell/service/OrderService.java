package com.obsidian.sell.service;

import com.obsidian.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-11 00:21
 */
public interface OrderService {
    //创建订单
    OrderDTO create(OrderDTO orderDTO);

    //查询单个订单
    OrderDTO findOne(String orderId);

    //查询订单列表
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    //取消订单
    OrderDTO cancel(OrderDTO orderDTO);

    //接单:完结订单
    OrderDTO finish(OrderDTO orderDTO);

    //支付订单
    OrderDTO paid(OrderDTO orderDTO);
}
