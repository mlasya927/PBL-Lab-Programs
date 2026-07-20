import java.io.*;
import java.util.Scanner;

public class Problem1_CountCharInFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name\n");
        String fileName = sc.nextLine().trim();

        System.out.print("Enter the character to be counted\n");
        char target = sc.nextLine().trim().charAt(0);
        target = Character.toLowerCase(target);

        int count = 0;
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int ch;
        while ((ch = br.read()) != -1) {
            if (Character.toLowerCase((char) ch) == target) {
                count++;
            }
        }
        br.close();

        System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + target + "'.");
    }
}
