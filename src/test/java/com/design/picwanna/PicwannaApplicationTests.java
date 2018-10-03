package com.design.picwanna;

import com.design.picwanna.service.RedisTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PicwannaApplicationTests {

    @Autowired
    RedisTestService redisTestService;

    @Test
    public void contextLoads() {

    }

    @Test
    public void redisTest(){
        redisTestService.set("test", "no game no life");
        System.out.println(redisTestService.get("test"));
    }

}
