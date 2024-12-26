package com.zjgsu.digitalhbh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zjgsu.digitalhbh.mapper")
public class DigitalhbhApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalhbhApplication.class, args);
    }

}