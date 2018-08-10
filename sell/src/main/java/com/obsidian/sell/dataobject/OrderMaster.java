package com.obsidian.sell.dataobject;

import com.obsidian.sell.enums.OrderStatusEnum;
import com.obsidian.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-10 23:08
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    //订单ID
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    //支付状态,默认0为未支付
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;
}
