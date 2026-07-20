import java.util.Scanner;

public class Problem3_BinaryPadded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-255): ");
        int num = Integer.parseInt(sc.nextLine().trim());

        String binary = Integer.toBinaryString(num);
        String padded = String.format("%8s", binary).replace(' ', '0');

        System.out.println(padded);
        sc.close();
    }
}
