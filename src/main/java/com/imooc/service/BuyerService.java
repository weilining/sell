package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 买家
 * Created by 韦师兄
 * 2019-02-10 15:42
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);

}
