package com.imooc.dto;

import lombok.Data;

/**
 * 购物车
 * Created by 韦师兄
 * 2019-02-09 13:52
 */
@Data
public class CartDTO {
    /**商品Id.*/
    private  String productId;
    /**数量。*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
