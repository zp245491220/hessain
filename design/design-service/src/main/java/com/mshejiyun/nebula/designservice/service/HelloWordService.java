package com.mshejiyun.nebula.designservice.service;

import api.HelloWordInterface;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloWordService implements HelloWordInterface {
    @Override
    public String sayHello() {
        return "hello word";
    }
}
