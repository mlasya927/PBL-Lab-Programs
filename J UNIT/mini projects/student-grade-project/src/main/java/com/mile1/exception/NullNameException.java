package com.mile1.exception;

/**
 * Thrown when a Student's name is null.
 */
public class NullNameException extends RuntimeException {

    public NullNameException() {
        super("Student name cannot be null");
    }

    public NullNameException(String message) {
        super(message);
    }
}
