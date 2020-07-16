package com.aagw.utills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName : RedisTemalateUtil
 * @Description : redis操作类
 * @Author : zhangpenghai
 * @Date: 2020-07-16 12:42
 */
@Lazy //延迟加载
@Component
public class RedisUtil {
    @Resource
    private RedisTemplate<String, String> redisTemplate;

    public void set(String key, String value) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value);
    }

    public void setex(String key, String value, int seconds) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value, seconds);
    }
}
