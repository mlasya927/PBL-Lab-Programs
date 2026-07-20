import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class EmployeeFI {
    int id;
    String name;
    String location;
    double salary;

    EmployeeFI(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        // ---------- Assignment 1: Function - extract locations ----------
        ArrayList<EmployeeFI> employees = new ArrayList<>();
        employees.add(new EmployeeFI(1, "Ravi", "Pune", 25000));
        employees.add(new EmployeeFI(2, "Sneha", "Hyderabad", 8000));
        employees.add(new EmployeeFI(3, "Kiran", "Pune", 15000));
        employees.add(new EmployeeFI(4, "Anitha", "Chennai", 5000));
        employees.add(new EmployeeFI(5, "Vijay", "Mumbai", 30000));

        Function<EmployeeFI, String> getLocation = e -> e.location;
        ArrayList<String> locations = new ArrayList<>();
        for (EmployeeFI e : employees) locations.add(getLocation.apply(e));
        System.out.println("Assignment 1 -> Locations: " + locations);

        // ---------- Assignment 2: Function - sum of numbers ----------
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50);
        Function<ArrayList<Integer>, Integer> sumFunction = list -> {
            int sum = 0;
            for (int n : list) sum += n;
            return sum;
        };
        System.out.println("\nAssignment 2 -> Sum: " + sumFunction.apply(numbers));

        // ---------- Assignment 3: Predicate - palindrome words ----------
        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, "madam", "hello", "level", "world", "civic",
                "java", "radar", "stack", "noon", "code");
        Predicate<String> isPalindrome = w -> new StringBuilder(w).reverse().toString().equals(w);
        System.out.print("\nAssignment 3 -> Palindromes: ");
        for (String w : words) if (isPalindrome.test(w)) System.out.print(w + " ");
        System.out.println();

        // ---------- Assignment 4: Predicate - salary < 10000 ----------
        Predicate<EmployeeFI> lowSalary = e -> e.getSalary() < 10000;
        System.out.print("\nAssignment 4 -> Employees with salary < 10000: ");
        for (EmployeeFI e : employees) if (lowSalary.test(e)) System.out.print(e.getName() + " ");
        System.out.println();

        // ---------- Assignment 5: Predicate - perfect squares ----------
        ArrayList<Integer> nums2 = new ArrayList<>();
        Collections.addAll(nums2, 2, 4, 7, 9, 15, 16, 20, 25, 30, 36);
        Predicate<Integer> isPerfectSquare = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };
        System.out.print("\nAssignment 5 -> Perfect squares: ");
        for (int n : nums2) if (isPerfectSquare.test(n)) System.out.print(n + " ");
        System.out.println();

        // ---------- Assignment 6: Consumer - reverse each word in place ----------
        ArrayList<String> words2 = new ArrayList<>();
        Collections.addAll(words2, "apple", "banana", "cherry", "date", "grape",
                "kiwi", "lemon", "mango", "peach", "plum");
        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, new StringBuilder(list.get(i)).reverse().toString());
            }
        };
        reverseWords.accept(words2);
        System.out.println("\nAssignment 6 -> Reversed words: " + words2);

        // ---------- Assignment 7: Consumer - odd/even ----------
        ArrayList<Integer> nums3 = new ArrayList<>();
        Collections.addAll(nums3, 2, 5, 8, 11, 14, 17, 20, 23, 26, 29);
        Consumer<Integer> printOddEven = n -> System.out.println(n + " " + (n % 2 == 0 ? "even" : "odd"));
        System.out.println("\nAssignment 7:");
        nums3.forEach(printOddEven);

        // ---------- Assignment 8: Supplier - first 10 primes ----------
        Supplier<ArrayList<Integer>> primeSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int num = 2;
            while (primes.size() < 10) {
                boolean isPrime = true;
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) { isPrime = false; break; }
                }
                if (isPrime) primes.add(num);
                num++;
            }
            return primes;
        };
        System.out.println("\nAssignment 8 -> First 10 primes: " + primeSupplier.get());
    }
}
