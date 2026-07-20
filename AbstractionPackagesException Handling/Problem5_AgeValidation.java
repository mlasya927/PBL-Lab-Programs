public class Problem5_AgeValidation {

    public static void validateArgs(String[] args) throws InvalidAgeException {
        if (args.length != 2) {
            throw new InvalidAgeException("Please pass exactly 2 arguments: name and age.");
        }

        int age;
        try {
            age = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            throw new InvalidAgeException("Age must be a valid integer.");
        }

        if (age < 18 || age >= 60) {
            throw new InvalidAgeException("Age must be between 18 (inclusive) and 60 (exclusive).");
        }
    }

    public static void main(String[] args) {
        try {
            validateArgs(args);
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            System.out.println("Name: " + name + ", Age: " + age + " - Valid entry.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Exiting the program.");
            return;
        }
    }
}
