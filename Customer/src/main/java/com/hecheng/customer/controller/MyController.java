package com.hecheng.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

    @Autowired //使用Rest方式调用服务
    private RestTemplate restTemplate;

    /**
     * 不通过eureka注册中心方式
     * @return
     */
    @RequestMapping("/getResuString")
    public String getRestString(){
        String str = restTemplate.getForObject("http://localhost:8081/getString", String.class);
        System.out.println("rest方式不通过注册中心调用服务："+str);
        return str;
    }

    @RequestMapping("/getRestEurekaString")
    public String getRestEurekaString(){
        String url = "http://Provider/getString";
        String str = restTemplate.getForObject(url, String.class);
        System.out.println(url+".................................");
        System.out.println("rest方式通过注册中心调用服务："+str);
        return str;
    }

}
