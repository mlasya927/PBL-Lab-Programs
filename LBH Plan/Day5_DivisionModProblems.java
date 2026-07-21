public class Day5_DivisionModProblems {

    static boolean isExactMultiple(int n, int m) {
        return n % m == 0;
    }

    static int countEven(int[] nums) {
        int count = 0;
        for (int n : nums) if (n % 2 == 0) count++;
        return count;
    }

    static int countOdd(int[] nums) {
        int count = 0;
        for (int n : nums) if (n % 2 != 0) count++;
        return count;
    }

    static int countEvenOrOdd(int[] nums, boolean countEvenFlag) {
        int count = 0;
        for (int n : nums) {
            if (countEvenFlag && n % 2 == 0) count++;
            else if (!countEvenFlag && n % 2 != 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isExactMultiple(15, 5));
        System.out.println(isExactMultiple(14, 5));

        int[] numbers = {12, 7, 8, 15, 20};
        System.out.println(countEven(numbers));
        System.out.println(countOdd(numbers));
        System.out.println(countEvenOrOdd(numbers, true));
        System.out.println(countEvenOrOdd(numbers, false));
    }
}
