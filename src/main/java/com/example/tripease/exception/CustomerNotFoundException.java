package com.example.tripease.exception;

public class CustomerNotFoundException {
    public static class CustommerNotFoundException extends RuntimeException{
        public CustommerNotFoundException(String message) {
            super(message);
        }
    }
}
