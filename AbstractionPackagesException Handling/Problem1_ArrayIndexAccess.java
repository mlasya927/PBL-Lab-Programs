import java.util.Scanner;

public class Problem1_ArrayIndexAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.nextLine().trim());
        }

        System.out.println("Enter the index of the array element you want to access");
        try {
            int index = Integer.parseInt(sc.nextLine().trim());
            System.out.println("The array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }

        sc.close();
    }
}
