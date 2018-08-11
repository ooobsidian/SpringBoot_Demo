package com.obsidian.sell.utils;

import java.util.Random;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-11 11:33
 */
public class KeyUtil {
    //生成唯一的主键(时间+随机数)
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
