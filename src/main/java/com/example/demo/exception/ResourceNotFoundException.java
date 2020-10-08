package com.example.demo.exception;

import java.lang.management.RuntimeMXBean;

public class ResourceNotFoundException extends RuntimeException {

    private String message;

    public ResourceNotFoundException(){

    }

    public ResourceNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
