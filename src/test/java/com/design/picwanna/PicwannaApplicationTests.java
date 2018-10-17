package com.design.picwanna;

import com.design.picwanna.dao.AttitudeDao;
import com.design.picwanna.dao.PermissionDao;
import com.design.picwanna.dao.TestDao;
import com.design.picwanna.entity.Attitude;
import com.design.picwanna.entity.Permission;
import com.design.picwanna.entity.RolePermission;
import com.design.picwanna.entity.key.AttitudeKey;
import com.design.picwanna.service.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    @Autowired
    TestService testService;
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    RolePermissionService rolePermissionService;
    @Autowired
    PermissionService permissionService;
    @Test
    public void contextLoads() {
//        //第0页开始
        Pageable pageable = PageRequest.of(0, 10);
        log.info("----------------------------"+testService.findAllByContentContaining("政府", pageable).getContent().toString());
//        com.design.picwanna.entity.Test test = new com.design.picwanna.entity.Test();
//        test.setContent("中华人民共和国位于亚洲东部，太平洋西岸，是工人阶级领导的、以工农联盟为基础的人民民主专政的社会主义国家");
//        testDao.save(test);
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
    @Autowired
    PermissionDao permissionDao;

    @Test
    public void permissionSqlTest() {
        log.info(rolePermissionService.findAllByRoleId(1).toString());
        log.info("--------------------------------------------------");
        log.info(permissionService.findAllPermissionByRoleId(1).toString());

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
        log.info(userService.findById("2").toString());
    }

    @Test
    public void visitLogSqlTest() {

    }


}
