package com.springbootdev.examples.swagger.exception;

public class ModelNotFoundException extends AppGenericException {

    public ModelNotFoundException(String message) {
        super(message);
    }
}
