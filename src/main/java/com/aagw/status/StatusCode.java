package com.aagw.status;

/**
 * @ClassName : LoginCode
 * @Description : 返回状态码定义
 * @Author : zhangpenghai
 * @Date: 2020-07-16 12:29
 */
public interface StatusCode {
    /* 其他自行处理
     *                 200：表示成功
     *                 201：表示未登录
     *                 500：表示错误，错误信息在msg字段中
     *                 501：bean验证错误，不管多少个错误都以map形式返回
     *                 502：拦截器拦截到用户token出错
     *                 555：异常抛出信息*/
      Integer SUCCESS = 200;
      Integer ERROR = 500;
      Integer BEAN_ERROR = 501;
      Integer TOKEN_ERROR = 502;
      Integer SERVICE_ERROR = 555;
      Integer NEED_LOGIN=201;
}
