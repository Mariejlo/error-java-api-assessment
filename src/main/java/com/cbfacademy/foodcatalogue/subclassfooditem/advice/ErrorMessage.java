package com.cbfacademy.foodcatalogue.subclassfooditem.advice;

public class ErrorMessage {
    

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
