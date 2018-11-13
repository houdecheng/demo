package com.sbdemo.demo.controller;

import com.sbdemo.demo.model.User;
import com.sbdemo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author hdc
 * @Date 2018/11/12 0012 17:15
 * @Version 1.0
 * @Description
 **/
@Controller
@RequestMapping("/user2")
public class UserController2 {
    @Autowired
    private UserService service;

//    @RequestMapping("/list")
    @RequestMapping("/list")
    public String list(){
        return "userList";
    }


    @RequestMapping("/listData")
    @ResponseBody
    public List<User> listData(){
        return service.selectAll();
    }

    @RequestMapping("/detailOne")
    public User detailOne(String id){
        return service.selectByPrimaryKey(id);
    }

}
