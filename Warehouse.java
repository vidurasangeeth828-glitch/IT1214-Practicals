import java.util.*;

public class Warehouse {
    public static void main(String[] args) {

        Inventory inv = new Inventory();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("======== Warehouse Inventory System ========");
            System.out.println("1.Add  2.Remove  3.Update  4.Search  5.Display All  0.Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Qty: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    inv.addItem(new Item(id, name, qty, price));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    inv.removeItem(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    String updateId = sc.nextLine();

                    System.out.print("New Qty: ");
                    int newQty = sc.nextInt();

                    inv.updateItem(updateId, newQty);
                    break;

                case 4:
                    System.out.print("Enter ID or Name: ");
                    inv.searchItem(sc.nextLine());
                    break;

                case 5:
                    inv.showAll();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}