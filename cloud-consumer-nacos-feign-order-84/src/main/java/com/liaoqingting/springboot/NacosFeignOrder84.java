package com.liaoqingting.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LiaoQingTing
 * @version 1.0
 * @date 2020/10/27 下午1:45
 */

@SpringBootApplication
@EnableFeignClients
public class NacosFeignOrder84 {
    public static void main(String[] args) {
        SpringApplication.run(NacosFeignOrder84.class,args);
    }
}
