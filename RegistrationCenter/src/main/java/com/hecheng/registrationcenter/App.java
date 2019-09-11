package com.hecheng.registrationcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启用eureke配置中心服务
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}
