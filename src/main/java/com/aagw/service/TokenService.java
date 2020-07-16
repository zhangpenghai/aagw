package com.aagw.service;

import com.aagw.entity.Uuser;
import com.aagw.utills.RedisUtil;
import com.alibaba.fastjson.JSONObject;
import nl.bitwalker.useragentutils.UserAgent;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.tomcat.jni.User;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @ClassName : TokenService
 * @Description : token 服务
 * @Author : zhangpenghai
 * @Date: 2020-07-16 16:53
 */
public class TokenService {
    @Resource
    private RedisUtil redisUtil;

    //生成token(格式为token:设备-加密的用户名-时间-六位随机数)
    public String generateToken(String userAgentStr, String username) {
        StringBuilder token = new StringBuilder("token:");
        //设备
        UserAgent userAgent = UserAgent.parseUserAgentString(userAgentStr);
        if (userAgent.getOperatingSystem().isMobileDevice()) {
            token.append("MOBILE-");
        } else {
            token.append("PC-");
        }
        //加密的用户名
        token.append(DigestUtils.md5Hex(username) + "-");
        //时间
        token.append(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) + "-");
        //六位随机字符串
        token.append(new Random().nextInt(999999 - 111111 + 1) + 111111 );
        System.out.println("token-->" + token.toString());
        return token.toString();
    }

    //把token存到redis中
    public void save(String token, Uuser user) {
        if (token.startsWith("token:PC")) {
            redisUtil.setex(token, JSONObject.toJSONString(user), 2*60*60);
        } else {
            redisUtil.set(token, JSONObject.toJSONString(user));
        }
    }

}
