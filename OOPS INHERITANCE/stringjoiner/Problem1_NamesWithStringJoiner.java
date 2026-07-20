import java.util.ArrayList;
import java.util.StringJoiner;

public class Problem1_NamesWithStringJoiner {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Sita");
        names.add("Kiran");

        StringJoiner sj = new StringJoiner(", ", "{", "}");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());
    }
}
