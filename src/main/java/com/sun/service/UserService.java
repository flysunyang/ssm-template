package com.sun.service;

import com.sun.pojo.User;

import java.util.List;

/**
 * @author zhaoyang
 * @description
 * @create 2019-12-01 10:52
 */
public interface UserService {

    /**
     * 查询User表所有的数据
     * @return
     */
    List<User> list();
}
