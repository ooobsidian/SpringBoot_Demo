package com.obsidian.sell.dto;

import lombok.Data;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-11 11:49
 */
@Data
public class CartDTO {
    //商品id
    private String productId;
    //商品数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
