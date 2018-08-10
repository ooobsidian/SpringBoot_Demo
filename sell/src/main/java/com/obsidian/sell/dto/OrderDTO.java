package com.obsidian.sell.dto;

import com.obsidian.sell.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-11 00:45
 */
@Data
public class OrderDTO {
    //订单ID
    private String orderId;

    //买家姓名
    private String buyerName;

    //买家手机
    private String buyerPhone;

    //买家地址
    private String buyerAddress;

    //买家openid
    private String buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单状态,默认0为新下单
    private Integer orderStatus;

    //支付状态,默认0为未支付
    private Integer payStatus;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
