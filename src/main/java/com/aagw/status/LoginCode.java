package com.aagw.status;

/**
 * @ClassName : LoginCode
 * @Description : 返回状态码定义
 * @Author : zhangpenghai
 * @Date: 2020-07-16 12:29
 */
public interface LoginCode {
    /* 其他自行处理
     *                 200：表示成功
     *                 500：表示错误，错误信息在msg字段中
     *                 501：bean验证错误，不管多少个错误都以map形式返回
     *                 502：拦截器拦截到用户token出错
     *                 555：异常抛出信息*/
     final static Integer SUCCESS = 200;
     final static Integer ERROR = 500;
     final static Integer BEAN_ERROR = 501;
     final static Integer TOKEN_ERROR = 502;
     final static Integer SERVICE_ERROR = 555;
}
