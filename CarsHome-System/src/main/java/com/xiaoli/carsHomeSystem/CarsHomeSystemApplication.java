package com.xiaoli.carsHomeSystem;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//开启定时任务
@EnableDiscoveryClient//服务注册
public class CarsHomeSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarsHomeSystemApplication.class,args);
    }
}
