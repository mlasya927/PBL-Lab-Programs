public class Day8_NumberBasedProblems {

    static int digitSum(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int digitSumEven(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0) sum += d;
            n /= 10;
        }
        return sum;
    }

    static int digitSumOdd(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 != 0) sum += d;
            n /= 10;
        }
        return sum;
    }

    static int digitSumOpt(int n, boolean sumEvenDigits) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            if (sumEvenDigits && d % 2 == 0) sum += d;
            else if (!sumEvenDigits && d % 2 != 0) sum += d;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 123456;
        System.out.println(digitSum(n));
        System.out.println(digitSumEven(n));
        System.out.println(digitSumOdd(n));
        System.out.println(digitSumOpt(n, true));
        System.out.println(digitSumOpt(n, false));
    }
}
