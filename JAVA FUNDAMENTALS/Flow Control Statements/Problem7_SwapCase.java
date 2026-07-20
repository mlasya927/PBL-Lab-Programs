public class Problem7_SwapCase {
    public static void main(String[] args) {
        char ch = 's';
        if (Character.isLowerCase(ch)) {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        }
    }
}
