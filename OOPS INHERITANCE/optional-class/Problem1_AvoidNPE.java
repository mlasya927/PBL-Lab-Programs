import java.util.Optional;

public class Problem1_AvoidNPE {
    public static void main(String[] args) {
        String names[] = new String[5];
        System.out.print(Optional.ofNullable(names[0])
                .map(String::length)
                .orElse(0));
        System.out.println();
    }
}
