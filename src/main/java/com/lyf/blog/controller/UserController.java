package com.lyf.blog.controller;

import com.lyf.blog.pojo.User;
import com.lyf.blog.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author:刘宇飞
 * @create: 2023-07-17 22:44
 * @Description: 用户控制类
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/getByUserId/{userId}",method = RequestMethod.GET)
    public User getUser(@PathVariable int userId){
        return userService.getByUserId(userId);
    }

}
