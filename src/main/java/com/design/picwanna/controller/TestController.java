package com.design.picwanna.controller;

import com.design.picwanna.entity.Attitude;
import com.design.picwanna.entity.key.AttitudeKey;
import com.design.picwanna.service.AttitudeService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * className: TestController
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-13
 */
@Controller
@RequestMapping("exp")
public class TestController {
    @Autowired
    AttitudeService attitudeService;
//    @ResponseBody
//    @RequestMapping("get")
//    public String get(){
//        return attitudeService.findAll().toString();
//    }
//    @ResponseBody
//    @RequestMapping("add")
//    public String add(){
//        Attitude attitude = new Attitude();
//        attitude.setUserId("9");
//        attitude.setPicId(9L);
//        attitudeService.saveAndFlush(attitude);
//        return "add";
//    }
//    @ResponseBody
//    @RequestMapping("delete")
//    public String delete(){
//        AttitudeKey attitudeKey = new AttitudeKey();
//        attitudeKey.setPicId(9L);
//        attitudeKey.setUserId("9");
//        attitudeService.deleteById(attitudeKey);
//        return "delete";
//    }
//    @ResponseBody
//    @RequestMapping("find")
//    public String find(){
//        AttitudeKey attitudeKey = new AttitudeKey();
//        attitudeKey.setPicId(1L);
//        attitudeKey.setUserId("1");
//        return attitudeService.findById(attitudeKey).toString();
//    }
//    @RequestMapping("index")
//    public String index(){
//        return "index";
//    }
//    @RequestMapping("image")
//    public String image(){
//        return "image";
//    }
//    @RequestMapping("tags")
//    public String tags(){
//        return "tags";
//    }
//    @RequestMapping("userInfo")
//    public String userInfo(){
//        return "userInfo";
//    }

    @RequestMapping({"/", "/index"})
    public String index(){
        return "test/index";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "test/login";
    }

    @RequestMapping("/login")
    public String testLogin(String username, String password, Model model){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
        try{
            subject.login(usernamePasswordToken);
            return "redirect:/exp/index";
        }catch (UnknownAccountException e){
            e.printStackTrace();
            model.addAttribute("msg", "用户名不存在");
            return "test/login";
        }catch (IncorrectCredentialsException e){
            e.printStackTrace();
            model.addAttribute("msg", "密码错误");
            return "test/login";
        }
    }

    @RequestMapping("add")
    public String add(){
        return "test/add";
    }

    @RequestMapping("select")
    public String select(){
        return "test/select";
    }

    @RequestMapping("/unAuth")
    public String unAuth(){
        return "test/unAuth";
    }
}
