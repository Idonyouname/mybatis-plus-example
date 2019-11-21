package com.amdox.liugui.mybatisplusexamplehello;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.amdox.liugui.mybatisplusexamplehello.mapper")
@SpringBootApplication
public class MybatisPlusExampleHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusExampleHelloApplication.class, args);
    }



}
