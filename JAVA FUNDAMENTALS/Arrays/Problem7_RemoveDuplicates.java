import java.util.LinkedHashSet;
public class Problem7_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);

        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        for (int num : set) {
            sb.append(num);
            if (i != set.size() - 1) sb.append(",");
            i++;
        }
        sb.append("}");
        System.out.println(sb.toString());
    }
}
