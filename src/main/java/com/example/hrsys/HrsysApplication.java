package com.example.hrsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.hrsys.dao")
@SpringBootApplication
public class HrsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrsysApplication.class, args);
    }

}
