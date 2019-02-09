package com.imooc.utils;

import java.util.Random;

/**
 * Created by 韦师兄
 * 2019-02-09 13:34
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     *
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
//        生成六位随机数
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);

    }
}
