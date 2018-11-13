package com.sbdemo.demo.service;

import com.sbdemo.demo.mapper.UserMapper;
import com.sbdemo.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author hdc
 * @Date 2018/11/12 0012 17:11
 * @Version 1.0
 * @Description
 **/
@Service
@Transactional
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(readOnly = false)
    public int insert(User record) {
        return mapper.insert(record);
    }

    @Override
    public User selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectAll() {
        return mapper.selectAll();
    }

    @Override
    @Transactional(readOnly = false)
    public int updateByPrimaryKey(User record) {
        return mapper.updateByPrimaryKey(record);
    }
}
