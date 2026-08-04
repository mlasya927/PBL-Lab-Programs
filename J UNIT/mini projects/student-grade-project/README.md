# Student Grade Calculation — Mini Project (Tech Module 3 + JUnit Package)

This project implements the **Student Grade Calculation** mini-project
(Tech Module 3: Abstraction / Packages / Exception Handling), extended
with a new `com.mile1.test` package containing JUnit test cases TC1–TC9
as required by the assignment brief.

## Project Structure

```
student-grade-project/
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── mile1
    │               ├── model
    │               │   └── Student.java
    │               ├── exception
    │               │   ├── NullStudentException.java
    │               │   ├── NullNameException.java
    │               │   └── NullMarksArrayException.java
    │               └── service
    │                   └── GradeCalculator.java
    └── test
        └── java
            └── com
                └── mile1
                    └── test
                        └── GradeCalculatorTest.java
```

## Packages

- **`com.mile1.model`** — `Student` class holding `name` and `marks[]`.
- **`com.mile1.exception`** — custom checked-at-runtime exceptions:
  - `NullStudentException` — thrown when the `Student` object is null.
  - `NullNameException` — thrown when the student's name is null.
  - `NullMarksArrayException` — thrown when the marks array is null.
- **`com.mile1.service`** — `GradeCalculator`, the class under test:
  - `validate(Student)` — runs the null checks above.
  - `calculateGrade(Student)` — validates, then averages the marks and
    returns a letter grade (A ≥ 90, B ≥ 80, C ≥ 70, D ≥ 60, else F).
  - `findNumberOfNullObjects(Student[])` — counts null entries in the array.
  - `findNumberOfNullName(Student[])` — counts non-null students with a null name.
  - `findNumberOfNullMarks(Student[])` — counts non-null students with a null marks array.
- **`com.mile1.test`** — `GradeCalculatorTest`, the new JUnit package
  requested in the assignment, implementing all 9 test cases:

| Test Case | Description |
|---|---|
| TC1 | Calculate the grade for valid objects — A grade |
| TC2 | Calculate the grade for valid objects — D grade |
| TC3 | Calculate the grade for valid objects — F grade |
| TC4 | Null Student object → `NullStudentException` |
| TC5 | Null name → `NullNameException` |
| TC6 | Null marks array → `NullMarksArrayException` |
| TC7 | `findNumberOfNullName` function |
| TC8 | `findNumberOfNullObjects` function |
| TC9 | `findNumberOfNullMarks` function |

## Building and Running

This is a standard Maven project (JUnit 5 / Jupiter).

```bash
# Compile
mvn compile

# Run all tests
mvn test
```

If you're not using Maven, compile manually with JUnit 5 (Jupiter +
Platform Console Launcher) on the classpath:

```bash
javac -d out $(find src/main/java -name "*.java")
javac -cp "out:junit-jupiter-api.jar" -d out $(find src/test/java -name "*.java")
```

## Notes

- Grade boundaries (A/B/C/D/F) were not specified numerically in the
  brief beyond "A grade", "D grade", and "F grade" examples — this
  implementation uses standard 90/80/70/60 average cut-offs. Adjust
  `GradeCalculator.calculateGrade()` if your instructor specified
  different thresholds.
- All exceptions extend `RuntimeException` (unchecked) so they can be
  thrown from `validate()` without a `throws` clause; change the
  superclass to `Exception` if checked exceptions are required.
