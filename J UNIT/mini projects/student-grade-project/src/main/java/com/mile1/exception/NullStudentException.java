package com.mile1.exception;

/**
 * Thrown when the Student object passed for validation/grading is null.
 */
public class NullStudentException extends RuntimeException {

    public NullStudentException() {
        super("Student object cannot be null");
    }

    public NullStudentException(String message) {
        super(message);
    }
}
