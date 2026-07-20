public class Problem3_NCopiesFirst2Chars {
    public static void main(String[] args) {
        String str = "Wipro";
        int n = str.length();
        String first2 = str.substring(0, 2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(first2);
        }
        System.out.println(sb.toString());
    }
}
