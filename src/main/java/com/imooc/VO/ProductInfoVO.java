package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品详情
 * Created by 韦师兄
 * 2019-02-03 18:50
 */
@Data
public class ProductInfoVO implements Serializable {

    private static final long serialVersionUID = 389149438710687408L;

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("icon")
    private String productIcon;
}
