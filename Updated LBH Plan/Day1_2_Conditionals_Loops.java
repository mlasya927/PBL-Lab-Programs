import java.util.Scanner;

public class Day1_2_Conditionals_Loops {

    static void checkPositiveNegativeZero(int n) {
        if (n > 0) System.out.println(n + " is Positive");
        else if (n < 0) System.out.println(n + " is Negative");
        else System.out.println(n + " is Zero");
    }

    static void greaterOfTwo(int a, int b) {
        if (a > b) System.out.println("Greater number is " + a);
        else if (b > a) System.out.println("Greater number is " + b);
        else System.out.println("Both numbers are equal: " + a);
    }

    static void checkEvenOdd(int n) {
        if (n % 2 == 0) System.out.println(n + " is EVEN");
        else System.out.println(n + " is ODD");
    }

    static void sumEvenOdd(int a, int b) {
        int sum = a + b;
        if (sum % 2 == 0) System.out.println("Sum " + sum + " is EVEN");
        else System.out.println("Sum " + sum + " is ODD");
    }

    static void printOneToHundred() {
        for (int i = 1; i <= 100; i++) System.out.print(i + " ");
        System.out.println();
    }

    static void printOddOneToNinetyNine() {
        for (int i = 1; i <= 99; i += 2) System.out.print(i + " ");
        System.out.println();
    }

    static void printEvenZeroToHundred() {
        for (int i = 0; i <= 100; i += 2) System.out.print(i + " ");
        System.out.println();
    }

    static void printHundredToZero() {
        for (int i = 100; i >= 0; i--) System.out.print(i + " ");
        System.out.println();
    }

    static void printHundredToOneSkip2() {
        for (int i = 100; i >= 1; i -= 3) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        checkPositiveNegativeZero(-5);
        greaterOfTwo(10, 25);
        checkEvenOdd(7);
        sumEvenOdd(3, 5);

        printOneToHundred();
        printOddOneToNinetyNine();
        printEvenZeroToHundred();
        printHundredToZero();
        printHundredToOneSkip2();

        sc.close();
    }
}
