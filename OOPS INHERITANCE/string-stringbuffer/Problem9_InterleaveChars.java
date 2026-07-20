public class Problem9_InterleaveChars {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int minLen = Math.min(a.length(), b.length());
        for (i = 0; i < minLen; i++) {
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }
        if (a.length() > minLen) sb.append(a.substring(minLen));
        if (b.length() > minLen) sb.append(b.substring(minLen));
        System.out.println(sb.toString());
    }
}
