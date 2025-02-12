package smartwarehousemanagementsystem;

//Concrete Class Groceries
public class Groceries extends WarehouseItem {
    String expiryDate;

    public Groceries(String name, String expiryDate) {
        super(name);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Groceries Item: " + getName());
        System.out.println("Expiry Date: " + expiryDate);
    }
}
