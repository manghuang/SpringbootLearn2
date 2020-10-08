package com.example.demo.exception;

import com.example.demo.controller.ExceptionController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Response;

@ControllerAdvice(assignableTypes = {ExceptionController.class})
@ResponseBody
public class GlobalExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ErrorResponse> exceptionHandle(Exception e){
        if(e instanceof  ResourceNotFoundException){
            return ResponseEntity.status(404).body(new ErrorResponse((new ResourceNotFoundException("Sorry, the rescourse node found!"))));

        }
        return null;
    }
}
