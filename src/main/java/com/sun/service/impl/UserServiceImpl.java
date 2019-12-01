package com.sun.service.impl;

import com.sun.mapper.UserMapper;
import com.sun.pojo.User;
import com.sun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaoyang
 * @description
 * @create 2019-12-01 10:52
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.findAll();
    }
}
