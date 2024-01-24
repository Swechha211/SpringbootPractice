package com.example.blogjpa.exceptions;

import com.example.blogjpa.payloads.ApiResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResource> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
        String message = ex.getMessage();
        ApiResource apiResource = new ApiResource(message,false);
        return new ResponseEntity<ApiResource>(apiResource, HttpStatus.NOT_FOUND);
    }


}
