package com.example.springdatajpa.exception;

public class NotFoundException  extends RuntimeException{
    public NotFoundException (String message) {
        super(message);
    }
}
