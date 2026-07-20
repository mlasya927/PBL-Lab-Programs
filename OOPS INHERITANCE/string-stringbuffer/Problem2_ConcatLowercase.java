public class Problem2_ConcatLowercase {
    public static void main(String[] args) {
        String a = "Sachin";
        String b = "Tendulkar";
        String result = (a + b).toLowerCase();

        // Remove double-char if the concatenation creates one
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            if (i > 0 && result.charAt(i) == result.charAt(i - 1) &&
                i == a.length()) {
                continue; // skip duplicate at the join point
            }
            sb.append(result.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
