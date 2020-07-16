package com.aagw.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName : ResulltLogin
 * @Description : 登录结果类
 * @Author : zhangpenghai
 * @Date: 2020-07-16 12:23
 */
@Data
public class Result implements Serializable {



    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    private String ok;    // 不使用
    //响应状态码
    private Integer code;
    //token
    private String token;
}
