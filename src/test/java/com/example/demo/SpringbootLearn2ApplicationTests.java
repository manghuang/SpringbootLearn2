package com.example.demo;

import com.example.demo.config.LibraryProperties;
import com.example.demo.config.ProfileProperties;
import com.example.demo.config.WebsiteProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLearn2ApplicationTests {

    @Autowired
    private WebsiteProperties websiteProperties;

    @Autowired
    private ProfileProperties profileProperties;

    @Autowired
    private LibraryProperties libraryProperties;
    @Test
    void contextLoads() {
        System.out.println(websiteProperties.toString());
        System.out.println(profileProperties.toString());
//        System.out.println(libraryProperties.getBooks());
//        System.out.println(libraryProperties.getLocation());
    }

}
