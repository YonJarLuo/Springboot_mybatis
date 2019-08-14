package com.jiayuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by LuoYJ on 2018/7/20.
 */
@SpringBootApplication
@MapperScan("com.jiayuan.dao")//将项目中对应的mapper的路径加进来
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
