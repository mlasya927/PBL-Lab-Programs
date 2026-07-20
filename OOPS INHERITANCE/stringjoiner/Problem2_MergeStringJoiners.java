import java.util.StringJoiner;

public class Problem2_MergeStringJoiners {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi").add("Mumbai").add("Chennai");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Pune").add("Hyderabad").add("Bangalore");

        StringJoiner s1MergedToS2 = new StringJoiner("-");
        s1MergedToS2.merge(s1).merge(s2);
        System.out.println("s1 merged to s2: " + s1MergedToS2);

        StringJoiner s2MergedToS1 = new StringJoiner("-");
        s2MergedToS1.merge(s2).merge(s1);
        System.out.println("s2 merged to s1: " + s2MergedToS1);
    }
}
