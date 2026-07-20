import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperationsOnStringList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice :");
            int choice = Integer.parseInt(sc.nextLine().trim());

            switch (choice) {
                case 1:
                    System.out.println("Enter the item to be inserted:");
                    String item = sc.nextLine();
                    list.add(item);
                    System.out.println("Inserted successfully");
                    break;

                case 2:
                    System.out.println("Enter the item to search :");
                    String searchItem = sc.nextLine();
                    if (list.contains(searchItem)) {
                        System.out.println("Item found in the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;

                case 3:
                    System.out.println("Enter the item to delete :");
                    String deleteItem = sc.nextLine();
                    if (list.contains(deleteItem)) {
                        list.remove(deleteItem);
                        System.out.println("Deleted successfully");
                    } else {
                        System.out.println("Item does not exist.");
                    }
                    break;

                case 4:
                    System.out.println("The items in the list are :");
                    for (String s : list) {
                        System.out.println(s);
                    }
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
