// Functional interfaces
interface FactorialFI {
    int getFactorial(int n);
}

interface DigitCountFI {
    int getDigitCount(int n);
}

interface PrimeCheckFI {
    String checkPrime(int n);
}

// Assignment 1: instance method
class MathOps {
    int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
}

// Assignment 2: static method
class NumberUtil {
    static int digitCount(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}

// Assignment 3: parameterized constructor
class PrimeChecker {
    String result;
    PrimeChecker(int n) {
        boolean isPrime = n > 1;
        for (int i = 2; i * i <= n && isPrime; i++) {
            if (n % i == 0) isPrime = false;
        }
        result = isPrime ? "Prime" : "Not Prime";
    }
    String getResult() {
        return result;
    }
}

public class MethodReferenceDemo {
    public static void main(String[] args) {

        // ---------- Assignment 1: instance method reference ----------
        MathOps mathOps = new MathOps();
        FactorialFI factorialFI = mathOps::factorial; // instance method reference
        System.out.println("Assignment 1 -> Factorial of 5: " + factorialFI.getFactorial(5));

        // ---------- Assignment 2: static method reference ----------
        DigitCountFI digitCountFI = NumberUtil::digitCount; // static method reference
        System.out.println("Assignment 2 -> Digit count of 458923: " + digitCountFI.getDigitCount(458923));

        // ---------- Assignment 3: constructor reference ----------
        PrimeCheckFI primeCheckFI = n -> new PrimeChecker(n).getResult(); // constructor reference wrapped
        // pure constructor reference version:
        java.util.function.Function<Integer, PrimeChecker> ctorRef = PrimeChecker::new;
        System.out.println("Assignment 3 -> 17 is: " + ctorRef.apply(17).getResult());
        System.out.println("Assignment 3 -> 20 is: " + ctorRef.apply(20).getResult());
    }
}
