package com.sun.mapper;

import com.sun.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhaoyang
 * @description
 * @create 2019-12-01 10:49
 */
public interface UserMapper {

    /**
     * 查询User表所有数据
     * @return
     */
    @Select({"select id, username, password from t_user"})
    List<User> findAll();

}
