package com.obsidian.sell.service;

import com.obsidian.sell.dto.OrderDTO;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-12 22:36
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
