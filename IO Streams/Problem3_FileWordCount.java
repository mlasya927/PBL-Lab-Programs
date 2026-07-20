import java.io.*;
import java.util.*;

public class Problem3_FileWordCount {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java Problem3_FileWordCount inputFile.txt outputFile.txt");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        Map<String, Integer> wordCount = new TreeMap<>();

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.trim().split("\\s+");
            for (String word : words) {
                if (word.isEmpty()) continue;
                word = word.replaceAll("[^a-zA-Z]", "");
                if (word.isEmpty()) continue;
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            bw.write(entry.getKey() + " : " + entry.getValue());
            bw.newLine();
        }
        bw.close();

        System.out.println("Word count written to " + outputFile);
    }
}
