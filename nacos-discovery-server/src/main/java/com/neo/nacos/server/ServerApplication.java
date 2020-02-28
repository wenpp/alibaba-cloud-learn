package com.neo.nacos.server;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class ServerApplication {
    static Logger log = LoggerFactory.getLogger(ServerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class);
    }

    @Slf4j
    @RestController
    static class TestController{
        @GetMapping("/hello")
        public String hello(@RequestParam String name){
            log.info("invoked name = " + name);
            return "【8002】hello"+name;
        }
    }
}
