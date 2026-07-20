import java.util.ArrayList;

public class StringOperationsWithArrayList {

    static ArrayList<String> performOperations(String s1, String s2) {
        ArrayList<String> result = new ArrayList<>();

        // 1. Character in each alternate index (0,2,4,...) of S1 replaced with S2
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                op1.append(s2);
            } else {
                op1.append(s1.charAt(i));
            }
        }
        result.add(op1.toString());

        // 2. If S2 appears more than once in S1, replace the LAST occurrence of S2
        //    in S1 with reverse of S2, else return S1+S2
        int firstIndex = s1.indexOf(s2);
        int lastIndex = s1.lastIndexOf(s2);
        String reverseS2 = new StringBuilder(s2).reverse().toString();

        if (firstIndex != -1 && firstIndex != lastIndex) {
            String op2 = s1.substring(0, lastIndex) + reverseS2 + s1.substring(lastIndex + s2.length());
            result.add(op2);
        } else {
            result.add(s1 + s2);
        }

        // 3. If S2 appears more than once in S1, delete the FIRST occurrence of S2 in S1,
        //    else return S1
        if (firstIndex != -1 && firstIndex != lastIndex) {
            String op3 = s1.substring(0, firstIndex) + s1.substring(firstIndex + s2.length());
            result.add(op3);
        } else {
            result.add(s1);
        }

        // 4. Divide S2 into two halves, add first half to the beginning of S1
        //    and second half to the end of S1.
        //    If odd number of letters in S2: (n/2)+1 letters go to beginning, rest to end.
        int n = s2.length();
        int firstHalfLen = (n % 2 == 0) ? n / 2 : (n / 2) + 1;
        String firstHalf = s2.substring(0, firstHalfLen);
        String secondHalf = s2.substring(firstHalfLen);
        String op4 = firstHalf + s1 + secondHalf;
        result.add(op4);

        // 5. If S1 contains characters that are in S2, change all such characters to *
        StringBuilder op5 = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) != -1) {
                op5.append('*');
            } else {
                op5.append(c);
            }
        }
        result.add(op5.toString());

        return result;
    }

    public static void main(String[] args) {
        String s1 = "JAVAJAVA";
        String s2 = "VA";

        ArrayList<String> output = performOperations(s1, s2);

        System.out.println("S1=\"" + s1 + "\"");
        System.out.println("S2=\"" + s2 + "\"");
        for (int i = 0; i < output.size(); i++) {
            System.out.println((i + 1) + ". " + output.get(i));
        }

        System.out.println("\nOutput: " + output);
    }
}
