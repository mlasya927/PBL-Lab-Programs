public class Problem8_SumIgnoringBetween6And7 {
    public static void main(String[] args) {
        int[] arr = {10, 3, 6, 1, 2, 7, 9};
        int sum = 0;
        boolean skipping = false;
        for (int num : arr) {
            if (num == 6) {
                skipping = true;
                continue;
            }
            if (num == 7) {
                skipping = false;
                continue;
            }
            if (!skipping) sum += num;
        }
        System.out.println("O/P: " + sum);
    }
}
