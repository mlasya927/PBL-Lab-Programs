public class Problem10_NRepetitionsLastNChars {
    public static void main(String[] args) {
        String str = "Wipro";
        int n = 3;
        String lastN = str.substring(str.length() - n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(lastN);
        }
        System.out.println(sb.toString());
    }
}
