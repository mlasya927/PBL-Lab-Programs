public class Day3_4_DivisionMod {

    static int isEven(int n) {
        return (n % 2 == 0) ? 2 : 1;
    }

    static int isOdd(int n) {
        if (n == 0) return 1;
        return (n % 2 != 0) ? 2 : 1;
    }

    static int lastDigit(int n) {
        n = Math.abs(n);
        return n % 10;
    }

    static int secondLastDigit(int n) {
        n = Math.abs(n);
        if (n < 10) return -1;
        return (n / 10) % 10;
    }

    static int addLastDigits(int input1, int input2) {
        int d1 = Math.abs(input1) % 10;
        int d2 = Math.abs(input2) % 10;
        return d1 + d2;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(7));
        System.out.println(isEven(0));
        System.out.println(isEven(-4));

        System.out.println(isOdd(7));
        System.out.println(isOdd(4));
        System.out.println(isOdd(0));
        System.out.println(isOdd(-7));

        System.out.println(lastDigit(197));
        System.out.println(lastDigit(-197));

        System.out.println(secondLastDigit(197));
        System.out.println(secondLastDigit(-197));
        System.out.println(secondLastDigit(5));

        System.out.println(addLastDigits(267, 154));
        System.out.println(addLastDigits(267, -154));
        System.out.println(addLastDigits(-267, 154));
        System.out.println(addLastDigits(-267, -154));
    }
}
