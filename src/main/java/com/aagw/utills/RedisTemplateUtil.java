package com.aagw.utills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @ClassName : RedisTemalateUtil
 * @Description : redis操作类
 * @Author : zhangpenghai
 * @Date: 2020-07-16 12:42
 */
@Lazy //延迟加载
public class RedisTemplateUtil {
    @Autowired
    private RedisTemplate redisTemplate;

    public static void main(String[] args) {

    }
}
