package com.xiaoli.carsHomeEureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CarsHomeEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarsHomeEurekaApplication.class,args);
    }
}
