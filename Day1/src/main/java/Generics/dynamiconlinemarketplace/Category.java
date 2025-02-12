package dynamiconlinemarketplace;

public class Category {
    String category;
    double price;

    // Constructor
    public Category(String category, double price){
        this.category = category;
        this.price = price;
    }

    // Method to apply discount
    public void applyDiscount(double percentage){
        price -= price * (percentage / 100);
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getCategory() {
        return category;
    }
}
