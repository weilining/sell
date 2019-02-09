package com.imooc.service.impl;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dto.OrderDTO;
import com.imooc.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 韦师兄
 * 2019-02-09 14:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;
    private final String BUYER_OPENID="110110";
    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("韦师兄");
        orderDTO.setBuyerAddress("慕课网");
        orderDTO.setBuyerPhone("123456789123");
        orderDTO.setBuyerOpenid(BUYER_OPENID);


        //购物车
        List<OrderDetail> orderDetailList=new ArrayList<>();
        OrderDetail o1 = new OrderDetail();
        o1.setProductId("1234568");
        o1.setProductQuantity(1);


        OrderDetail o2=new OrderDetail();
        o2.setProductId("123457");
        o2.setProductQuantity(2);

        orderDetailList.add(o2);
        orderDetailList.add(o1);

        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO result = orderService.create(orderDTO);
        log.info("【创建订单】 result={}",result);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() {
    }

    @Test
    public void findList() {
    }

    @Test
    public void cancle() {
    }

    @Test
    public void finish() {
    }

    @Test
    public void paid() {
    }
}