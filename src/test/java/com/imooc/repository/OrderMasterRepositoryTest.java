package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by 韦师兄
 * 2019-02-09 00:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;
    @Test
    public void saveTest(){
        OrderMaster orderMaster=new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("师兄");
        orderMaster.setBuyerPhone("123456789123");
        orderMaster.setBuyerAddress("慕课网");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(new BigDecimal(2.3));
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }
    @Test

    public void findByBuyerOpenid() throws Exception{

    }
}