package com.obsidian.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @program: sell
 * @description: 商品
 * @author: obsidian
 * @create: 2018-08-08 17:01
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;
    //    名字
    private String productName;
    //    单价
    private BigDecimal productPrice;
    //    库存
    private Integer productStock;
    //    描述
    private String productDescription;
    //    小图
    private String productIcon;
    //    状态(0正常,1下架)
    private Integer productStatus;
    //    类目编号
    private Integer categoryType;

}
