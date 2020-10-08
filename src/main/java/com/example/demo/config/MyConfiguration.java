package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class MyConfiguration {

    public MyConfiguration(){
        System.out.println("构造方法执行...");
    }

    // 在构造方法之后执行，servlet的init方法之前执行
    @PostConstruct
    public void init(){
        System.out.println("PostConstruct方法执行...");
    }

    // 在servlet的destory方法之后执行
    @PreDestroy
    public void destory(){
        System.out.println("PreDestory方法执行...");
    }

}
