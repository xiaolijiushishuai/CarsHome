package com.xiaoli.carsHomeSystem;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//开启定时任务
@EnableDiscoveryClient//服务注册
@EntityScan("com.xiaoli.carshomemodel.System.domain")
@ComponentScan(basePackages={"com.xiaoli.carsHomeServiceApi"})//扫描接口
@ComponentScan(basePackages={"com.xiaoli.carsHomeSystem"})
public class CarsHomeSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarsHomeSystemApplication.class,args);
    }
}
