package com.aagw.controller.Impl;

import com.aagw.controller.LoginUserController;
import com.aagw.entity.Result;
import com.aagw.entity.Uuser;
import com.aagw.status.LoginCode;
import org.springframework.stereotype.Controller;

/**
 * @ClassName : LoginUserImpl
 * @Description : 用户登录实现
 * @Author : zhangpenghai
 * @Date: 2020-07-16 12:35
 */
@Controller
public class LoginUserControllerImpl implements LoginUserController {

    @Override
    public Result UserLogin(Uuser user) {

        Result result = new Result();
        result.setCode(LoginCode.SUCCESS);
        return result;
    }
}
