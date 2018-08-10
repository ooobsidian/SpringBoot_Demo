package com.obsidian.sell.enums;

import lombok.Getter;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-10 23:14
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消");

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
