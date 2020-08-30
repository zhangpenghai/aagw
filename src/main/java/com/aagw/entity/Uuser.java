package com.aagw.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName : Uuser
 * @Description : 用户实体类
 * @Author : zhangpenghai
 * @Date: 2020-07-16 12:15
 */
@Data
@ToString
@TableName("u_user")
public class Uuser implements Serializable {
    @TableId(type = IdType.AUTO)
    private int uid;
    //用户登录名
    @TableField(value = "user_name")
    private String userName;
    //用户名称
    @TableField(value = "name")
    private String Uname;
    //用户密码
    @TableField(value = "password")
    private String password;
    //用户手机
    @TableField(value = "phone")
    private String phone;
    //姓名
    @TableField(value = "sex")
    private String sex;
    //注册时间
    @TableField(value = "register_time")
    private Date registerTime;
}
