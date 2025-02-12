package smartwarehousemanagementsystem;

//Concrete Class Electronics
 public class Electronics extends WarehouseItem {
    String brand;

    public Electronics(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics Item: " + getName());
        System.out.println("Brand Name: " + brand);
    }
}
