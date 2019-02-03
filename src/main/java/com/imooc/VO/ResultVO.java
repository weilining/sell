package com.imooc.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * Created by 韦师兄
 * 2019-02-03 18:36
 */
@Data
public class ResultVO<T> {

    /*错误码*/
    private Integer code;
    /*提示信息*/
    private String msg;
    /*具体内容*/
    private T data;


}
