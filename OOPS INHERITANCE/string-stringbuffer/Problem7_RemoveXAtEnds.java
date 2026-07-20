public class Problem7_RemoveXAtEnds {
    public static void main(String[] args) {
        String str = "xHix";
        int start = 0, end = str.length();
        if (str.charAt(0) == 'x') start = 1;
        if (str.charAt(str.length() - 1) == 'x') end = str.length() - 1;
        System.out.println(str.substring(start, end));
    }
}
