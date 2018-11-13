package com.sbdemo.demo.service;

import com.sbdemo.demo.mapper.StudentMapper;
import com.sbdemo.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author hdc
 * @Date 2018/11/12 0012 11:38
 * @Version 1.0
 * @Description
 **/
@Service
public class StudentServiceImpl implements  StudentService {

    @Autowired
    private StudentMapper mapper;

    @Override
    public List<Student> list() {
        return mapper.list();
    }
}
