public class Problem2_MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {12, 45, 3, 67, 21};
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
