package com.imooc.enums;

import lombok.Getter;

/**
 * Created by 韦师兄
 * 2019-02-08 23:30
 */
@Getter
public enum OrderStatusEnum implements CodeEnum{
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消"),
    ;
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code,String message) {
        this.code = code;
        this.message=message;
    }

}
