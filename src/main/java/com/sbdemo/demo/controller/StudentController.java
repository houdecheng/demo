package com.sbdemo.demo.controller;

import com.sbdemo.demo.model.Student;
import com.sbdemo.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author hdc
 * @Date 2018/11/12 0012 11:39
 * @Version 1.0
 * @Description
 **/
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @RequestMapping("/list")
    @ResponseBody
    public List<Student> list(){
        return  service.list();
    }

}
