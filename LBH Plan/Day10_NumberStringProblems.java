public class Day10_NumberStringProblems {

    static String secondWordUpperCase(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        if (words.length < 2) return "";
        return words[1].toUpperCase();
    }

    static boolean isPalindromeString(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return new StringBuilder(clean).reverse().toString().equals(clean);
    }

    static int weightOfString(String s) {
        int weight = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                weight += (c - 'a' + 1);
            }
        }
        return weight;
    }

    static int mostFrequentDigit(int n) {
        n = Math.abs(n);
        int[] freq = new int[10];
        if (n == 0) return 0;
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        int maxDigit = 0, maxCount = 0;
        for (int d = 0; d <= 9; d++) {
            if (freq[d] > maxCount) {
                maxCount = freq[d];
                maxDigit = d;
            }
        }
        return maxDigit;
    }

    public static void main(String[] args) {
        System.out.println(secondWordUpperCase("the quick brown fox"));

        System.out.println(isPalindromeString("Madam"));
        System.out.println(isPalindromeString("A man a plan a canal Panama"));
        System.out.println(isPalindromeString("Hello"));

        System.out.println(weightOfString("abc"));
        System.out.println(weightOfString("Java"));

        System.out.println(mostFrequentDigit(112233));
        System.out.println(mostFrequentDigit(1223345));
    }
}
