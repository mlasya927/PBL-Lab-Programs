import java.util.HashSet;
import java.util.Set;

public class Day7_MathBasedProblems2 {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int countPrimesInRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    static int allDigitsCount(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int uniqueDigitsCount(int n) {
        n = Math.abs(n);
        Set<Integer> digits = new HashSet<>();
        if (n == 0) return 1;
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }
        return digits.size();
    }

    static int nonRepeatedDigitsCount(int n) {
        n = Math.abs(n);
        int[] freq = new int[10];
        int temp = n;
        if (temp == 0) return 1;
        while (temp > 0) {
            freq[temp % 10]++;
            temp /= 10;
        }
        int count = 0;
        for (int f : freq) if (f == 1) count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimesInRange(1, 20));

        System.out.println(allDigitsCount(123456));
        System.out.println(allDigitsCount(-909));

        System.out.println(uniqueDigitsCount(112233));
        System.out.println(uniqueDigitsCount(112345));

        System.out.println(nonRepeatedDigitsCount(112233));
        System.out.println(nonRepeatedDigitsCount(112345));
    }
}
