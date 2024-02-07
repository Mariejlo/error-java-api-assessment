package com.cbfacademy.foodcatalogue.subclassfooditem.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cbfacademy.foodcatalogue.subclassfooditem.exception.ResourceNotFoundException;

import org.springframework.http.HttpStatus;

@ControllerAdvice //Methods are now applicable to all controllers
public class GlobalExceptionHandler {

    // Exception handlers go here

    @ExceptionHandler(ResourceNotFoundException.class) //Method should be invoked when the exception is thrown
    @ResponseStatus(HttpStatus.NOT_FOUND) //Status code should be 404
    @ResponseBody //Return type should be JSON
    public ErrorMessage handleResourceNotFoundException(ResourceNotFoundException ex) { 
        return new ErrorMessage(HttpStatus.NOT_FOUND.value(), ex.getMessage());
    }

    @ExceptionHandler(Exception.class)  
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) //Status code should be 500 
    @ResponseBody //Return type should be JSON 
    public ErrorMessage handleException(Exception ex) { 
        return new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(), "An  unexpected error has occurred");
    }
}
