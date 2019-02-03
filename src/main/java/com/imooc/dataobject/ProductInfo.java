package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品
 * Created by 韦师兄
 * 2019-02-03 14:12
 */
@Entity
@Data
public class ProductInfo {


    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    private Integer productStatus;

//    类目编号
    private Integer categoryType;


}
