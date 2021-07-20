package com.jd.employeemanager.exception;

//classe de tratamento de exceção
public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
