package com.example.demo.config;

import javafx.fxml.Initializable;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration2 implements InitializingBean, DisposableBean {

    public MyConfiguration2(){
        System.out.println("MyConfiguration2的构造方法执行...");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("MyConfiguration2的destroy方法执行...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyConfiguration2的afterPropertiesSet方法执行...");
    }
}
