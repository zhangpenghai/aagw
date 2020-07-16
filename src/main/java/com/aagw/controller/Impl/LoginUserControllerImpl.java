package com.aagw.controller.Impl;
import com.aagw.controller.LoginUserController;
import com.aagw.entity.Result;
import com.aagw.entity.Uuser;
import com.aagw.service.LoginUserService;
import com.aagw.status.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName : LoginUserImpl
 * @Description : 用户登录实现
 * @Author : zhangpenghai
 * @Date: 2020-07-16 12:35
 */
@RestController
@RequestMapping("/user")
public class LoginUserControllerImpl implements LoginUserController {
    @Autowired
    private LoginUserService loginUserService;
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("/login")
    /***
    * @description 
    * @Param 用户登录 
    * @author zhangpenghai 
    * @date 2020/7/16 17:26 
    * @return com.aagw.entity.Result  
    */
    @Override
    public Result UserLogin(HttpServletRequest request, Uuser user) {

        Result result = loginUserService.UserLogin(user);
        if (result.getCode()==200){
            HttpSession session = request.getSession();
            session.setAttribute("loginUserId", user.getUid());
            redisTemplate.opsForValue().set("loginUser:" + user.getUid(), session.getId());
            return result;
        }
        return result;
    }
    /***
    * @description 
    * @Param [] 查询所有用户 
    * @author zhangpenghai 
    * @date 2020/7/16 17:26 
    * @return com.aagw.entity.Result  
    */
    @RequestMapping("findAll")
    public Result findAllUuser(){
        Result result=new Result();
        result.setCode(StatusCode.SUCCESS);
        result.setData(loginUserService.findAllUuser());
        return result;
    }
}
