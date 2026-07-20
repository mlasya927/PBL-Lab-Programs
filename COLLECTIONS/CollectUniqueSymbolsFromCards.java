import java.util.Scanner;
import java.util.TreeSet;

class Card implements Comparable<Card> {
    String symbol;
    int number;

    Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    // Two cards are considered "same" if they have the same symbol
    // (Set will then keep only the FIRST occurrence inserted for each symbol)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        return this.symbol.equals(((Card) o).symbol);
    }

    @Override
    public int hashCode() {
        return symbol.hashCode();
    }

    // sort alphabetically by symbol
    @Override
    public int compareTo(Card o) {
        return this.symbol.compareTo(o.symbol);
    }

    public String toString() {
        return symbol + " " + number;
    }
}

public class CollectUniqueSymbolsFromCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Card> cardSet = new TreeSet<>();
        int totalCardsEntered = 0;

        // keep reading cards until 4 distinct symbols are gathered
        while (cardSet.size() < 4) {
            System.out.println("Enter a card :");
            String symbol = sc.nextLine().trim();
            int number = Integer.parseInt(sc.nextLine().trim());

            cardSet.add(new Card(symbol, number)); // duplicate symbol -> ignored (Set)
            totalCardsEntered++;
        }

        System.out.println("Four symbols gathered in " + totalCardsEntered + " cards.");
        System.out.println("Cards in Set are :");
        for (Card c : cardSet) {
            System.out.println(c);
        }

        sc.close();
    }
}
