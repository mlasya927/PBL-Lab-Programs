package com.mile1.service;

import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.model.Student;

/**
 * Core service for the Student Grade Calculation mini-project.
 *
 * Responsibilities:
 *  - validate a Student object (null checks -> custom exceptions)
 *  - calculate a letter grade from the average of a student's marks
 *  - count nulls across an array of Student objects (null objects,
 *    null names, null marks arrays)
 */
public class GradeCalculator {

    /**
     * Validates a Student object.
     *
     * @throws NullStudentException   if the student object itself is null
     * @throws NullNameException      if the student's name is null
     * @throws NullMarksArrayException if the student's marks array is null
     */
    public void validate(Student student) {
        if (student == null) {
            throw new NullStudentException();
        }
        if (student.getName() == null) {
            throw new NullNameException();
        }
        if (student.getMarks() == null) {
            throw new NullMarksArrayException();
        }
    }

    /**
     * Calculates the letter grade for a valid student based on the
     * average of their marks.
     *
     * Grade bands:
     *   A : average >= 90
     *   B : 80 <= average < 90
     *   C : 70 <= average < 80
     *   D : 60 <= average < 70
     *   F : average < 60
     */
    public String calculateGrade(Student student) {
        validate(student);

        int[] marks = student.getMarks();
        if (marks.length == 0) {
            return "F";
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    /**
     * Counts how many Student objects in the array are themselves null.
     */
    public int findNumberOfNullObjects(Student[] students) {
        int count = 0;
        if (students == null) {
            return count;
        }
        for (Student student : students) {
            if (student == null) {
                count++;
            }
        }
        return count;
    }

    /**
     * Counts how many (non-null) Student objects in the array have a
     * null name.
     */
    public int findNumberOfNullName(Student[] students) {
        int count = 0;
        if (students == null) {
            return count;
        }
        for (Student student : students) {
            if (student != null && student.getName() == null) {
                count++;
            }
        }
        return count;
    }

    /**
     * Counts how many (non-null) Student objects in the array have a
     * null marks array.
     */
    public int findNumberOfNullMarks(Student[] students) {
        int count = 0;
        if (students == null) {
            return count;
        }
        for (Student student : students) {
            if (student != null && student.getMarks() == null) {
                count++;
            }
        }
        return count;
    }
}
