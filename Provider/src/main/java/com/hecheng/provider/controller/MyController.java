package com.hecheng.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getString")
    public String getString(){
        return "springcloud微服务，提供者端口号："+port;
    }

}
