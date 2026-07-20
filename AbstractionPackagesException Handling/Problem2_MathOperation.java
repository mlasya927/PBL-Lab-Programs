public class Problem2_MathOperation {
    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                throw new IllegalArgumentException("Please pass exactly 5 integers as command line arguments.");
            }

            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            double average = (double) sum / arr.length;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
