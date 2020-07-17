package com.aagw.config;

import com.aagw.filter.RedisSessionInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName : WebSecurityConfig
 * @Description : 拦截器配置
 * @Author : zhangpenghai
 * @Date: 2020-07-16 17:10
 */
@Configuration
public class WebSecurityConfig extends WebMvcConfigurerAdapter {
    @Bean
    public RedisSessionInterceptor getSessionInterceptor()
    {
        return new RedisSessionInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        //所有已user开头的访问都要进入RedisSessionInterceptor拦截器进行登录验证，并排除login接口(全路径)。必须写成链式，分别设置的话会创建多个拦截器。
        //必须写成getSessionInterceptor()，否则SessionInterceptor中的@Autowired会无效
        registry.addInterceptor(getSessionInterceptor()).
                addPathPatterns("/user/**").
                excludePathPatterns("/user/login")

        ;
        super.addInterceptors(registry);
    }

}
