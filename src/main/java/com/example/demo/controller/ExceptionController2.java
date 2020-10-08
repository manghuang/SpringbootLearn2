package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class ExceptionController2 {

    @GetMapping("throwException2")
    public void throwException2(){
        throw new ResourceNotFoundException2("Sorry, the resource not found!");
    }

    @GetMapping("throwException3")
    public void throwException3(){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sorry, the resource not found!");
    }
}
