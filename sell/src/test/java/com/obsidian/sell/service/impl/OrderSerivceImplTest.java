package com.obsidian.sell.service.impl;

import com.obsidian.sell.dataobject.OrderDetail;
import com.obsidian.sell.dto.OrderDTO;
import com.obsidian.sell.enums.OrderStatusEnum;
import com.obsidian.sell.enums.PayStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderSerivceImplTest {

    @Autowired
    private OrderSerivceImpl orderSerivce;

    private final String BUYER_OPENID = "110110";

    private final String ORDER_ID = "123456";

    @Test
    public void create() throws Exception {

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("obsidian");
        orderDTO.setBuyerAddress("alphalrx.cn");
        orderDTO.setBuyerOpenid(BUYER_OPENID);
        orderDTO.setBuyerPhone("18101971575");
        List<OrderDetail> orderDetailList = new ArrayList<>();

        OrderDetail o1 = new OrderDetail();
        o1.setProductId("123123");
        o1.setProductQuantity(1);
        orderDetailList.add(o1);

        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO result = orderSerivce.create(orderDTO);
        log.info("[创建订单] result={}", result);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() throws Exception {
        OrderDTO result = orderSerivce.findOne(ORDER_ID);
        log.info("[查询某个订单] result={}", result);
        Assert.assertEquals(ORDER_ID, result.getOrderId());
    }

    @Test
    public void findList() throws Exception {
        PageRequest request = new PageRequest(0, 2);
        Page<OrderDTO> orderDTOPage = orderSerivce.findList(BUYER_OPENID, request);
        Assert.assertNotEquals(0, orderDTOPage.getTotalElements());
    }

    @Test
    public void cancel() throws Exception {
        OrderDTO orderDTO = orderSerivce.findOne(ORDER_ID);
        OrderDTO result = orderSerivce.cancel(orderDTO);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(), result.getOrderStatus());
    }

    @Test
    public void finish() throws Exception {
        OrderDTO orderDTO = orderSerivce.findOne(ORDER_ID);
        OrderDTO result = orderSerivce.finish(orderDTO);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(), result.getOrderStatus());
    }

    @Test
    public void paid() throws Exception {
        OrderDTO orderDTO = orderSerivce.findOne(ORDER_ID);
        OrderDTO result = orderSerivce.paid(orderDTO);
        Assert.assertEquals(PayStatusEnum.SUCCESS.getCode(), result.getPayStatus());
    }
}