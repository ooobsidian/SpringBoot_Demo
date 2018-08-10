package com.obsidian.sell.service.impl;

import com.obsidian.sell.dataobject.OrderDetail;
import com.obsidian.sell.dataobject.ProductInfo;
import com.obsidian.sell.dto.OrderDTO;
import com.obsidian.sell.service.OrderService;
import com.obsidian.sell.service.ProductSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-11 00:52
 */
@Service
public class OrderSerivceImpl implements OrderService {

    @Autowired
    private ProductSerivce productSerivce;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        // 1. 查询商品(数量, 价格)
        for (OrderDetail orderDetail : orderDTO.getOrderDetailList()) {
            ProductInfo productInfo = productSerivce.findOne(orderDetail.getProductId())
        }
        // 2. 计算总价
        // 3. 写入订单数据库(orderMaster和orderDetail)
        // 4. 扣库存*
        return null;
    }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
