package com.hecheng.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient //启用该服务注册到注册中心中
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

    //注入一个RestTemplate
    @Bean
    //使用rest方式以别名方式进行调用，依赖ribbon负载均衡器 @LoadBalanced
    //@loadBalanced就能让这个RestTemplate在请求时拥有客户端拥有负载均衡的能力
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
