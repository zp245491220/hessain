package com.mshejiyun.nebula.design.designclient.controller;

import api.HelloWordInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private HelloWordInterface helloWorldService;

    @RequestMapping("/test")
    public String test() {
        return helloWorldService.sayHello();
    }
}
