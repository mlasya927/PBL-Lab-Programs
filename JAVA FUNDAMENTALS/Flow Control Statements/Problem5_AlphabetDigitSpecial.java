public class Problem5_AlphabetDigitSpecial {
    public static void main(String[] args) {
        char ch = 'A';
        if (Character.isLetter(ch)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
