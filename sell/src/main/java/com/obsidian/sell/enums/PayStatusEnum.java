package com.obsidian.sell.enums;

import lombok.Getter;

/**
 * @program: sell
 * @description:
 * @author: ggmr
 * @create: 2018-08-10 23:19
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;
    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
