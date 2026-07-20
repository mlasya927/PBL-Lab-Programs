import java.util.Optional;

public class Problem3_OptionalEmployee {
    static class Employee {
        String name;
        Employee(String name) { this.name = name; }
    }

    public static void main(String[] args) {
        Employee emp = null;

        Optional<Employee> optionalEmp = Optional.ofNullable(emp);
        if (optionalEmp.isPresent()) {
            System.out.println("Employee name: " + optionalEmp.get().name);
        } else {
            throw new InvalidEmployeeException("Employee object is null");
        }
    }
}
