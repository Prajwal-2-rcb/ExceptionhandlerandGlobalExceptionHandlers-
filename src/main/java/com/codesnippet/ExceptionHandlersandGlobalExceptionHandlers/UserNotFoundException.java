package com.codesnippet.ExceptionHandlersandGlobalExceptionHandlers;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
