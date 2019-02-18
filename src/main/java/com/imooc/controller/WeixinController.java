package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxc8951dba20e8ba76&secret=caff618149de3e744ac6beab42047bc1&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}", response);
    }
}

