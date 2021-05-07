package com.ting.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class TingConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TingConsumerApplication.class, args);
    }

}
