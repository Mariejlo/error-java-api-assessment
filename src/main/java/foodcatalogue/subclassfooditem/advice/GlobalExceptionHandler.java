

public class globalExceptionHandler {
    
}
package com.foodcatalogue.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    // Create the Error Message class (optional)
    package foodcatalogue.subclassfooditem.advice;

    public class ErrorMessage { //Class to send back consistent error response format
        private final int statusCode;
        private final String message;

        public ErrorMessage(int statusCode, String message) {
            this.statusCode = statusCode;
            this.message = message;
        }
        
         // Getters
    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }
    
}
