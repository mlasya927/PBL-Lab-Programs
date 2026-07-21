import java.util.HashMap;
import java.util.Map;

public class Day9_NumberBasedProblems2 {

    static boolean isPalindromeNumber(int n) {
        int original = n;
        int reversed = 0;
        n = Math.abs(n);
        int temp = n;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        return Math.abs(original) == reversed;
    }

    static boolean isPalindromePossible(int n) {
        n = Math.abs(n);
        Map<Integer, Integer> freq = new HashMap<>();
        if (n == 0) return true;
        while (n > 0) {
            int d = n % 10;
            freq.put(d, freq.getOrDefault(d, 0) + 1);
            n /= 10;
        }
        int oddCount = 0;
        for (int count : freq.values()) {
            if (count % 2 != 0) oddCount++;
        }
        return oddCount <= 1;
    }

    static String createPin(String alpha, String beta, String gamma) {
        return "" + alpha.length() + beta.length() + gamma.length();
    }

    static int weightOfHillPattern(int n) {
        String digitsStr = String.valueOf(Math.abs(n));
        int[] digits = new int[digitsStr.length()];
        for (int i = 0; i < digitsStr.length(); i++) digits[i] = digitsStr.charAt(i) - '0';

        int i = 0;
        int len = digits.length;
        while (i + 1 < len && digits[i] < digits[i + 1]) i++;

        if (i == 0 || i == len - 1) return 0;

        while (i + 1 < len && digits[i] > digits[i + 1]) i++;

        if (i != len - 1) return 0;

        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(12321));
        System.out.println(isPalindromeNumber(12345));

        System.out.println(isPalindromePossible(1221));
        System.out.println(isPalindromePossible(123));

        System.out.println(createPin("hello", "hi", "java"));

        System.out.println(weightOfHillPattern(13542));
        System.out.println(weightOfHillPattern(12345));
    }
}
