package com.imooc.service;

import com.imooc.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;

/**
 * 支付
 * Created by 韦师兄
 * 2019-02-18 23:49
 */
public interface PayService {


    PayResponse create(OrderDTO orderDTO);
}
