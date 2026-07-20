public class Problem6_InterestPercentage {
    public static void main(String[] args) {
        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        double interest;

        if (gender.equalsIgnoreCase("Female") && age >= 1 && age <= 58) {
            interest = 8.2;
        } else if (gender.equalsIgnoreCase("Female") && age >= 59 && age <= 100) {
            interest = 9.2;
        } else if (gender.equalsIgnoreCase("Male") && age >= 1 && age <= 58) {
            interest = 8.4;
        } else if (gender.equalsIgnoreCase("Male") && age >= 59 && age <= 100) {
            interest = 10.5;
        } else {
            interest = 0.0;
        }
        System.out.println("The percentage of interest is " + interest + "%");
    }
}
