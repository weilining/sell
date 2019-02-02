package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 韦师兄
 * 2019-02-01 15:04
 */



@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {


    //    private  final Logger logger= LoggerFactory.getLogger(LoggerTest2.class);
    @Test
    public void test1(){
        String name = "imooc";
        String password="123456";
        log.debug("debug...");
        log.info("name:"+name+" ,password:"+password);
        log.info("name:{}, password:{}",name,password);
        log.error("error...");
        log.warn("warn...");

    }
}
