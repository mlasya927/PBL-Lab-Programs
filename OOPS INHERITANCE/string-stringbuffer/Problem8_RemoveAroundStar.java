public class Problem8_RemoveAroundStar {
    public static void main(String[] args) {
        String str = "ab*cd";
        int starIndex = str.indexOf('*');
        String result = str.substring(0, starIndex - 1) + str.substring(starIndex + 2);
        System.out.println(result);
    }
}
