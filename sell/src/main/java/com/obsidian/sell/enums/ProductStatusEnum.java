package com.obsidian.sell.enums;

import lombok.Getter;

/**
 * @program: sell
 * @description: 商品状态
 * @author: obsidian
 * @create: 2018-08-08 22:12
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架");
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
