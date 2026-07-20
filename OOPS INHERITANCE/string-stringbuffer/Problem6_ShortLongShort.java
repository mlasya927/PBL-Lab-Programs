public class Problem6_ShortLongShort {
    public static void main(String[] args) {
        String a = "hi";
        String b = "hello";
        String shorter = (a.length() <= b.length()) ? a : b;
        String longer = (a.length() <= b.length()) ? b : a;
        System.out.println(shorter + longer + shorter);
    }
}
