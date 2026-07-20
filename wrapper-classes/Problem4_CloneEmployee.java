public class Problem4_CloneEmployee {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("Naga Lakshmi", 22, 50000.0);
        Employee clone = (Employee) original.clone();

        // Change original's properties
        original.name = "Changed Name";
        original.age = 30;
        original.salary = 70000.0;

        System.out.println("Original Employee:");
        original.printDetails();

        System.out.println("Clone Employee:");
        clone.printDetails();

        // Observation: clone remains unaffected because clone() created a
        // separate copy of the object; changes to original do not reflect in clone.
    }
}
