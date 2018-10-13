package com.design.picwanna.controller;

import com.design.picwanna.entity.Attitude;
import com.design.picwanna.entity.key.AttitudeKey;
import com.design.picwanna.service.AttitudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className: TestController
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-13
 */
@RestController
public class TestController {
    @Autowired
    AttitudeService attitudeService;
    @RequestMapping("get")
    public String get(){
        return attitudeService.findAll().toString();
    }

    @RequestMapping("add")
    public String add(){
        Attitude attitude = new Attitude();
        attitude.setUserId("9");
        attitude.setPicId(9L);
        attitudeService.saveAndFlush(attitude);
        return "add";
    }

    @RequestMapping("delete")
    public String delete(){
        AttitudeKey attitudeKey = new AttitudeKey();
        attitudeKey.setPicId(9L);
        attitudeKey.setUserId("9");
        attitudeService.deleteById(attitudeKey);
        return "delete";
    }
    @RequestMapping("find")
    public String find(){
        AttitudeKey attitudeKey = new AttitudeKey();
        attitudeKey.setPicId(1L);
        attitudeKey.setUserId("1");
        return attitudeService.findById(attitudeKey).toString();
    }
}
