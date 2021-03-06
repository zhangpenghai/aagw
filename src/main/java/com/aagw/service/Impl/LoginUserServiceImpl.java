package com.aagw.service.Impl;

import com.aagw.dao.UserDao;
import com.aagw.entity.Result;
import com.aagw.entity.Uuser;
import com.aagw.service.LoginUserService;
import com.aagw.status.StatusCode;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : LoginUserServiceImpl
 * @Description : 用户登录实现
 * @Author : zhangpenghai
 * @Date: 2020-07-16 12:40
 */
@Service
@Slf4j
public class LoginUserServiceImpl implements LoginUserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Result UserLogin(Uuser user) {
        QueryWrapper<Uuser> wrapper=new QueryWrapper<>();
        wrapper.eq("user_name",user.getUserName()).
                eq("password",user.getPassword());
        user = userDao.selectOne(wrapper);
        Result result = new Result();
        if (user!=null){
            result.setCode(StatusCode.SUCCESS);
            result.setData(user);
            result.setMsg("登录成功");
            log.info("登录成功"+result.toString());
            return result;
        }
        //登录失败
        result.setCode(502);
        result.setMsg("账号或密码错误！");
        log.info("登录失败"+result.toString());
        return result;
    }

    @Override
    public List<Uuser> findAllUuser() {
        List<Uuser> uusers = userDao.selectList(new QueryWrapper<>());
        log.info("查询所有数据："+uusers.toString());
        return uusers;
    }
}
