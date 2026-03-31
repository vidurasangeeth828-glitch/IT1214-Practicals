public class Item {
    String id;
    String name;
    int quantity;
    double price;

    
    public Item(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

   
    public void display() {
	
		
        System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Qty: " + quantity);
		System.out.println("Price: " + price);
    }
}