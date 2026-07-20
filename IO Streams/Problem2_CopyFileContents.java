import java.io.*;
import java.util.Scanner;

public class Problem2_CopyFileContents {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input file name\n");
        String inputFile = sc.nextLine().trim();

        System.out.print("Enter the output file name\n");
        String outputFile = sc.nextLine().trim();

        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();

        System.out.println("File is copied.");
    }
}
