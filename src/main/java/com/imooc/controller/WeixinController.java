package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 韦师兄
 * 2019-02-11 19:54
 */
@RestController
@RequestMapping("/weixin")
@Slf4j

public class WeixinController {
    @GetMapping("/auth")
    public void auth(@RequestParam("code")String code){
        log.info("进入auto方法。。。");
        log.info("code={}", code);
    }

}
