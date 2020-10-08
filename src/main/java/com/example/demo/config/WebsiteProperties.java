package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:website.properties")
public class WebsiteProperties {

    @Value("${url}")
    private String url;

    @Override
    public String toString() {
        return "WebsiteProperties{" +
                "url='" + url + '\'' +
                '}';
    }
}
