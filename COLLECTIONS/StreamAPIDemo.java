import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empNo;
    String name;
    int age;
    String location;

    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String toString() {
        return "Employee{empNo=" + empNo + ", name=" + name + ", age=" + age + ", location=" + location + "}";
    }
}

class Student {
    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public String toString() {
        return "Student{rollNo=" + rollNo + ", name=" + name + ", mark=" + mark + "}";
    }
}

public class StreamAPIDemo {
    public static void main(String[] args) {

        // ---------- Assignment 1 ----------
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, -4, 3, -8, 7, -10, 5, -2, 9, -6, 12);

        List<Integer> negativeEvens = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Assignment 1 -> Original: " + numbers);
        System.out.println("Assignment 1 -> Negative even numbers: " + negativeEvens);

        // ---------- Assignment 2 ----------
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Ravi", 28, "Pune"));
        employees.add(new Employee(102, "Sneha", 25, "Hyderabad"));
        employees.add(new Employee(103, "Kiran", 30, "Pune"));
        employees.add(new Employee(104, "Anitha", 27, "Chennai"));
        employees.add(new Employee(105, "Vijay", 32, "Pune"));

        List<Employee> puneEmployees = employees.stream()
                .filter(e -> e.location.equals("Pune"))
                .collect(Collectors.toList());

        System.out.println("\nAssignment 2 -> Employees in Pune:");
        puneEmployees.forEach(System.out::println);

        // ---------- Assignment 3 ----------
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Arjun", 65));
        students.add(new Student(2, "Priya", 45));
        students.add(new Student(3, "Manoj", 78));
        students.add(new Student(4, "Divya", 30));
        students.add(new Student(5, "Suresh", 55));

        long clearedCount = students.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("\nAssignment 3 -> Students who cleared (mark >= 50): " + clearedCount);
    }
}
