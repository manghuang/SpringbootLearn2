package com.example.demo.exception;

public class ErrorResponse {
    private String message;
    private String errorTypeName;

    public ErrorResponse(Exception e){
        this(e.getClass().getName(), e.getMessage());
    }

    public ErrorResponse(String message, String errorTypeName) {
        this.message = message;
        this.errorTypeName = errorTypeName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorTypeName() {
        return errorTypeName;
    }

    public void setErrorTypeName(String errorTypeName) {
        this.errorTypeName = errorTypeName;
    }
}
