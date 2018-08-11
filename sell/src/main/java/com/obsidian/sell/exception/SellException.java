package com.obsidian.sell.exception;

import com.obsidian.sell.enums.ResultEnum;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-11 11:17
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
