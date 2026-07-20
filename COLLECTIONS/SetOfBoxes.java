import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Box {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double volume() {
        return length * width * height;
    }

    // Boxes are the "same" when their volumes are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        return this.volume() == ((Box) o).volume();
    }

    @Override
    public int hashCode() {
        return Double.hashCode(volume());
    }

    public String toString() {
        return "Length =" + length + " Width =" + width + " Height =" + height + " Volume =" + volume();
    }
}

public class SetOfBoxesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Box> boxSet = new HashSet<>();

        System.out.println("Enter the number of Box");
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");
            System.out.println("Enter Length");
            double length = Double.parseDouble(sc.nextLine().trim());
            System.out.println("Enter Width");
            double width = Double.parseDouble(sc.nextLine().trim());
            System.out.println("Enter Height");
            double height = Double.parseDouble(sc.nextLine().trim());

            Box box = new Box(length, width, height);
            boxSet.add(box); // duplicate volume -> automatically rejected by Set
        }

        System.out.println("Unique Boxes in the Set are");
        for (Box b : boxSet) {
            System.out.println(b);
        }

        sc.close();
    }
}
