package com.java.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GaoTao on 2017/12/17.
 */
@SpringBootApplication
/*@RestController
@MapperScan("com.java.demo.dao")*/
@MapperScan("com.java.demo.mapper")//将项目中对应的mapper类的路径加进来就可以了
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
