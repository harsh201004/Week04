package smartwarehousemanagementsystem;

//Concrete CLass Furniture
public class Furniture extends WarehouseItem {
    String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.println("Furniture Item: " + getName());
        System.out.println("Material: " + material);
    }
}
