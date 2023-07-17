package com.lyf.blog.controller;

import com.lyf.blog.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
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

    public void getUser(){

    }
}
