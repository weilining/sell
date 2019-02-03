package com.imooc.controller;

import com.imooc.VO.ProductInfoVO;
import com.imooc.VO.ProductVO;
import com.imooc.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * 买家商品
 * Created by 韦师兄
 * 2019-02-03 18:31
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO list(){
        ResultVO resultVO=new ResultVO();
        ProductVO productVO=new ProductVO();
        ProductInfoVO productInfoVO=new ProductInfoVO();
        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));

        resultVO.setData(Arrays.asList(productVO));

        resultVO.setCode(0);
        resultVO.setMsg("成功");


        return resultVO;

    }
}
