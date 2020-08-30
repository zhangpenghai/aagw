package com.aagw;


import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.aagw.dao")
@ComponentScans({@ComponentScan("com.aagw.controller"),
        @ComponentScan("com.aagw.config"),
        @ComponentScan("com.aagw.service")
})
@Slf4j
@Configuration(value = "*.xml")
public class AagwApplication {
    //protected static final Logger logger = LoggerFactory.getLogger(StudyBootDemoApplication.class);
    public static void main(String[] args) {
        log.info("开始加载springBoot");
        SpringApplication.run(AagwApplication.class, args);
       log.info("springBoot加载完毕！");
    }

}
