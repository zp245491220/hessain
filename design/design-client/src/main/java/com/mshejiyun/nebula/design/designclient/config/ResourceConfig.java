package com.mshejiyun.nebula.design.designclient.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.PostConstruct;

@Configuration
public class ResourceConfig {
    @Configuration
    @ConditionalOnProperty(name = "env", havingValue = "dev")
    @ImportResource(locations = {"classpath:hessain/hessian-dev.xml"})
    class ResourceDev {
        @PostConstruct
        public void log() {
            System.out.println("#################start load hessain bean for in dev#################");
        }
    }

    @Configuration
    @ConditionalOnProperty(name = "env", havingValue = "alpha")
    @ImportResource(locations = {"classpath:hessain/hessian-alpha.xml"})
    class ResourceAlpha {
        @PostConstruct
        public void log() {
            System.out.println("#################start load hessain bean for in alpha#################");
        }
    }
}
