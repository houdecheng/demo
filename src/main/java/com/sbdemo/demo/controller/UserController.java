package com.sbdemo.demo.controller;

import com.sbdemo.demo.model.User;
import com.sbdemo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hdc
 * @Date 2018/11/12 0012 17:15
 * @Version 1.0
 * @Description
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

//    @RequestMapping("/list")
    @GetMapping("/list")
    public String list(){
        return "userList";
    }


    @RequestMapping("/detailOne")
    public User detailOne(String id){
        return service.selectByPrimaryKey(id);
    }

}
