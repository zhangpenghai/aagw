package com.aagw;

import com.aagw.controller.LoginUserController;
import com.aagw.dao.UserDao;
import com.aagw.entity.Result;
import com.aagw.entity.Uuser;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class aagwTest {
    @Autowired
    UserDao userDao;
    @Autowired
    LoginUserController controller;
    @Test
    public void test1(){
        Result all = controller.findAll();
        log.info(all.toString());
    }
}
