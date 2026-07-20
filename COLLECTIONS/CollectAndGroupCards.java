import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

class CardGC {
    String symbol;
    int number;

    CardGC(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String toString() {
        return symbol + " " + number;
    }
}

public class CollectAndGroupCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Cards :");
        int n = Integer.parseInt(sc.nextLine().trim());

        // TreeMap keeps symbols sorted alphabetically automatically
        TreeMap<String, List<CardGC>> cardMap = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ":");
            String symbol = sc.nextLine().trim();
            int number = Integer.parseInt(sc.nextLine().trim());

            CardGC card = new CardGC(symbol, number);
            cardMap.computeIfAbsent(symbol, k -> new ArrayList<>()).add(card);
        }

        // print distinct symbols in alphabetical order
        StringBuilder symbols = new StringBuilder();
        for (String s : cardMap.keySet()) {
            symbols.append(s).append(" ");
        }
        System.out.println("Distinct Symbols are :");
        System.out.println(symbols.toString().trim());

        // for each symbol print card details, count and sum
        for (String symbol : cardMap.keySet()) {
            List<CardGC> cards = cardMap.get(symbol);
            System.out.println("Cards in " + symbol + " Symbol");
            int sum = 0;
            for (CardGC c : cards) {
                System.out.println(c);
                sum += c.number;
            }
            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}
