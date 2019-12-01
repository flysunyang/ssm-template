package com.sun.controller;

import com.sun.pojo.User;
import com.sun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author zhaoyang
 * @description
 * @create 2019-12-01 10:35
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "username", required = false, defaultValue = "张三")
                                    String username, ModelMap modelMap) {
        try {
            if(!"张三".equals(username)) {
                username = new String(username.getBytes("iso-8859-1"), "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        modelMap.put("username", username);
        return "user/hello";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<User> list() {
        return userService.list();
    }
}
