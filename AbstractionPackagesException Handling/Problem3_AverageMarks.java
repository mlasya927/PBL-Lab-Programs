import java.util.Scanner;

public class Problem3_AverageMarks {

    public static void validateMarks(int marks) throws NegativeMarksException, OutOfRangeMarksException {
        if (marks < 0) {
            throw new NegativeMarksException("Marks cannot be negative: " + marks);
        }
        if (marks > 100) {
            throw new OutOfRangeMarksException("Marks cannot be more than 100: " + marks);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int student = 1; student <= 2; student++) {
            try {
                System.out.println("Enter name of student " + student + ":");
                String name = sc.nextLine().trim();

                int total = 0;
                for (int subject = 1; subject <= 3; subject++) {
                    System.out.println("Enter marks for subject " + subject + ":");
                    int marks = Integer.parseInt(sc.nextLine().trim());
                    validateMarks(marks);
                    total += marks;
                }

                double average = total / 3.0;
                System.out.println("Average marks for " + name + " = " + average);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric marks only.");
            } catch (NegativeMarksException | OutOfRangeMarksException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}
