package com.imooc.controller;

import com.imooc.service.SecKillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 韦师兄
 * 2019-03-11 00:35
 */
@RestController
@RequestMapping("/skill")
@Slf4j
public class SecKillController {

    @Autowired
    private SecKillService secKillService;

    /**
     * 查询秒杀活动特价商品的信息
     * @param productId
     * @return
     * @throws Exception
     */
    @GetMapping("/query/{productId}")
    public String query(@PathVariable String productId)throws Exception{
        return secKillService.querySecKillProductInfo(productId);
    }

    /**
     * 秒杀，没有抢到获得"哎呦喂，xxxxxx"，抢到了会返回剩余的库存量
     * @param productId
     * @return
     * @throws Exception
     */
    @GetMapping("/order/{productId}")
    public String skill(@PathVariable String productId)throws Exception{
        log.info("@skill request, productId:" + productId);
        secKillService.orderProductMockDiffUser(productId);
        return secKillService.querySecKillProductInfo(productId);
    }

    @GetMapping("/order/test")
    public Map<String, Object>  test()throws Exception{
        Map<String, Object> map=new HashMap<>();
        map.put("000","成功");
        return map;
//        {
//            "000": "成功"
//        }
    }
}
