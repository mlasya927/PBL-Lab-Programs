public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Naga Lakshmi", 600000.0, 2023, "NI123456A");

        System.out.println("Name       : " + emp.getName());
        System.out.println("Salary     : " + emp.getAnnualSalary());
        System.out.println("Year Start : " + emp.getYearStarted());
        System.out.println("NI Number  : " + emp.getNationalInsuranceNumber());
    }
}
