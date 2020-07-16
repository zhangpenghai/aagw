package com.aagw.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName : Uuser
 * @Description : 用户实体类
 * @Author : zhangpenghai
 * @Date: 2020-07-16 12:15
 */
@Data
public class Uuser implements Serializable {
    private int uid;
    //用户登录名
    private String userName;
    //用户名称
    private String Uname;
    //用户密码
    private String password;
    //用户手机
    private String phone;
    //姓名
    private String sex;
    //注册时间
    private Date registerTime;
}
