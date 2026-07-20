import java.util.Arrays;
public class Problem5_Largest2Smallest2 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 3, 67, 21, 9};
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int n = sorted.length;
        System.out.println("Largest 2 numbers: " + sorted[n-1] + ", " + sorted[n-2]);
        System.out.println("Smallest 2 numbers: " + sorted[0] + ", " + sorted[1]);
    }
}
