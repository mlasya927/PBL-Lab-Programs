import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Assignment 4: interface + implementing class
interface WordCount {
    int count(String str);
}

class MyClassWithLambda {
    public static void main2() {
        WordCount wc = (str) -> str.trim().split("\\s+").length;
        String sentence = "This is a sample sentence for word count";
        System.out.println("Assignment 4 -> Word count: " + wc.count(sentence));
    }
}

public class LambdaExpressionsDemo {

    // helper for assignment 1
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // ---------- Assignment 1 ----------
        // Create ArrayList al, add 25 random numbers, print all primes using lambda
        ArrayList<Integer> al = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            al.add(rand.nextInt(100) + 1); // 1 to 100
        }
        System.out.println("Assignment 1 -> Numbers: " + al);
        System.out.print("Assignment 1 -> Prime numbers: ");
        al.forEach(n -> {
            if (isPrime(n)) System.out.print(n + " ");
        });
        System.out.println();

        // ---------- Assignment 2 ----------
        // Create ArrayList al, add 10 words, print in reverse order using lambda
        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, "apple", "banana", "cherry", "date", "elderberry",
                "fig", "grape", "honeydew", "kiwi", "lemon");
        System.out.println("\nAssignment 2 -> Original: " + words);
        System.out.print("Assignment 2 -> Reverse order: ");
        for (int i = words.size() - 1; i >= 0; i--) {
            int idx = i;
            Runnable r = () -> System.out.print(words.get(idx) + " ");
            r.run();
        }
        System.out.println();

        // ---------- Assignment 3 ----------
        // Print words whose length is odd, using lambda
        System.out.print("\nAssignment 3 -> Odd length words: ");
        words.forEach(w -> {
            if (w.length() % 2 != 0) System.out.print(w + " ");
        });
        System.out.println();

        // ---------- Assignment 4 ----------
        System.out.println();
        MyClassWithLambda.main2();
    }
}
