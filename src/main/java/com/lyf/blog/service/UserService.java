package com.lyf.blog.service;

import com.lyf.blog.pojo.User;
import com.lyf.blog.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author:刘宇飞
 * @create: 2023-07-17 22:44
 * @Description:
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User getByUserId(int userId){
        return userMapper.selectById(userId);
    }

}
