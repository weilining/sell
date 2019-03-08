package com.imooc.exception;

import com.imooc.enums.ResultEnum;
import lombok.Data;

/**
 * Created by 韦师兄
 * 2019-02-09 13:16
 */
@Data
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code=resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
