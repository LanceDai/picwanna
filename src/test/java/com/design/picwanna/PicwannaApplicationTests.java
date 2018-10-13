package com.design.picwanna;

import com.design.picwanna.dao.AttitudeDao;
import com.design.picwanna.entity.Attitude;
import com.design.picwanna.entity.key.AttitudeKey;
import com.design.picwanna.service.AttitudeService;
import com.design.picwanna.service.RedisTestService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PicwannaApplicationTests {

    @Autowired
    RedisTestService redisTestService;
    @Autowired
    AttitudeDao attitudeDao;
    @Autowired
    AttitudeService attitudeService;

    @Test
    public void contextLoads() {

    }

    @Test
    public void redisTest() {

    }

    @Test
    public void attitudeSqlTest() {
//        Attitude attitude = new Attitude();
//        attitude.setAttitude(1);
//        attitude.setCollect(1);
//        attitude.setPicId(1L);
//        attitude.setUserId("6");
//        attitudeService.saveAndFlush(attitude);
//        log.info(attitudeService.saveAndFlush(attitude).toString());
//        attitudeDao.saveAndFlush(attitude);
//        AttitudeKey attitudeKey = new AttitudeKey("6", 1L);
//        attitudeDao.deleteById(attitudeKey);
//        log.info(attitudeDao.findByUserIdAndPicId("2", 1L).toString());

//        log.info(attitudeDao.findById(attitudeKey).toString());
        List<Attitude> list = attitudeService.findAll();
        for (Attitude attitude1 : list){
            System.out.println(attitude1);
        }

        System.out.println(attitudeService.findAll());


    }

    @Test
    public void followSqlTest() {

    }

    @Test
    public void messageSqlTest() {

    }

    @Test
    public void permissionSqlTest() {

    }

    @Test
    public void picSqlTest() {

    }

    @Test
    public void roleSqlTest() {

    }

    @Test
    public void rolePermissionSqlTest() {

    }

    @Test
    public void userSqlTest() {

    }

    @Test
    public void visitLogSqlTest() {

    }


}
