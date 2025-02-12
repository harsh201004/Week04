package dynamiconlinemarketplace;


import java.util.ArrayList;

// Generic Product class
public class Product<T extends Category> {
    ArrayList<T> items = new ArrayList<>();

    // Method to add items
    public void addItems(T item){
        items.add(item);
    }

    // Method to get items
    public ArrayList<T> getItems() {
        return items;
    }

    // Method to apply discount and display details
    public void applyDiscount(T product, double percentage){
        System.out.println("Before Discount: " + product.getCategory() + " - Rs. " + product.getPrice());
        product.applyDiscount(percentage);
        System.out.println("After Discount: " + product.getCategory() + " - Rs. " + product.getPrice());
    }
}
