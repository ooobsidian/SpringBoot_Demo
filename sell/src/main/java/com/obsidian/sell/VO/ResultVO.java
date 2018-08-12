package com.obsidian.sell.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @program: sell
 * @description: http请求返回的最外层对象
 * @author: obsidian
 * @create: 2018-08-09 18:44
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> {
    //    错误码
    private Integer code;
    //    提示信息
    private String msg;
    //    具体内容
    private T data;
}
