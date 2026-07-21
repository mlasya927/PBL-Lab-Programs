public class Day6_MathBasedProblems {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    static long nthFibonacci(int n) {
        if (n <= 0) return -1;
        if (n == 1) return 0;
        if (n == 2) return 1;
        long a = 0, b = 1;
        for (int i = 3; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    static int nthPrime(int n) {
        int count = 0;
        int num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) count++;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17));
        System.out.println(isPrime(15));

        System.out.println(factorial(5));
        System.out.println(factorial(0));

        System.out.println(nthFibonacci(1));
        System.out.println(nthFibonacci(5));
        System.out.println(nthFibonacci(10));

        System.out.println(nthPrime(1));
        System.out.println(nthPrime(5));
        System.out.println(nthPrime(10));
    }
}
