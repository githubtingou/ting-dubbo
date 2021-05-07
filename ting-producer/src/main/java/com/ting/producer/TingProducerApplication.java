package com.ting.producer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class TingProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TingProducerApplication.class, args);
    }

}
