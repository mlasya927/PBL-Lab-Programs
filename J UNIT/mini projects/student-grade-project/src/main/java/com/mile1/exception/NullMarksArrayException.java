package com.mile1.exception;

/**
 * Thrown when a Student's marks array is null.
 */
public class NullMarksArrayException extends RuntimeException {

    public NullMarksArrayException() {
        super("Marks array cannot be null");
    }

    public NullMarksArrayException(String message) {
        super(message);
    }
}
