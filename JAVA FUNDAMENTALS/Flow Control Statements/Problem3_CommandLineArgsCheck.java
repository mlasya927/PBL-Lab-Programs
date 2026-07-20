public class Problem3_CommandLineArgsCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No Values");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                sb.append(args[i]);
                if (i != args.length - 1) sb.append(",");
            }
            System.out.println(sb.toString());
        }
    }
}
