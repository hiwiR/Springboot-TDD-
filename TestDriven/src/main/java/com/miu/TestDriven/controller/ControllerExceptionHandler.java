package com.miu.TestDriven.controller;

import com.miu.TestDriven.exception.CarNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(value= CarNotFoundException.class)
    public ResponseEntity<Object> exception(CarNotFoundException exp){
        return new ResponseEntity<>("Car not found", HttpStatus.NOT_FOUND);
    }
}
