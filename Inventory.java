import java.util.*;

public class Inventory {
    ArrayList<Item> list = new ArrayList<>();

   
    public void addItem(Item item) {
        list.add(item);
        System.out.println("Item added!");
    }

    
    public void removeItem(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id.equals(id)) {
                list.remove(i);
                System.out.println("Item removed!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

   
    public void updateItem(String id, int qty) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id.equals(id)) {
                list.get(i).quantity = qty;
                System.out.println("Updated!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

  
    public void searchItem(String key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id.equals(key) ||
                list.get(i).name.equalsIgnoreCase(key)) {

                list.get(i).display();
                return;
            }
        }
        System.out.println("Item not found!");
    }

    
    public void showAll() {
        if (list.size() == 0) {
            System.out.println("No items!");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
        }
    }
}