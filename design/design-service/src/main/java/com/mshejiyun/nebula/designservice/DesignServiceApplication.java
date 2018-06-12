package com.mshejiyun.nebula.designservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@ImportResource(locations = {"classpath:hessain.xml"})
public class DesignServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignServiceApplication.class, args);
    }

}
