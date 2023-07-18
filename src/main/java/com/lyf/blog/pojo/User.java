package com.lyf.blog.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author:刘宇飞
 * @create: 2023-07-17 22:42
 * @Description: 用户表
 */
@Data
@TableName("td_user")
public class User extends BasePojo{
    @TableId("user_id")
    private Integer userId;
    @TableField("login_name")
    private String loginName;
    @TableField("password")
    private String password;
    @TableField("nick_name")
    private String nickName;

}
