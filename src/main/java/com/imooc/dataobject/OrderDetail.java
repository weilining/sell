package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by 韦师兄
 * 2019-02-09 00:04
 */
@Entity
@Data
public class OrderDetail {
    @Id
//    detailId是主键
    private String detailId;
    //    订单id
    private String orderId;
    //    商品id
    private String productId;
    //    商品将名称
    private String productName;
    //    商品单价
    private BigDecimal productPrice;
    //    商品数量
    private Integer productQuantity;
    //    商品小图
    private String productIcon;



}
