public class Employee implements Cloneable {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
}
