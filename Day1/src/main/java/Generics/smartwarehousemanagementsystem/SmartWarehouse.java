package smartwarehousemanagementsystem;


public class SmartWarehouse {
    public static void main(String[] args) {


        Electronics electronicItem1 = new Electronics("Laptop", "HP");
        Electronics electronicItem2 = new Electronics("Smartphone", "Apple");

        Groceries groceryItem1 = new Groceries("Milk", "12-02-2025");
        Groceries groceryItem2 = new Groceries("Bread", "15-02-2025");

        Furniture furnitureItem1 = new Furniture("Chair", "Wood");
        Furniture furnitureItem2 = new Furniture("Table", "Metal");

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(electronicItem1);
        electronicsStorage.addItem(electronicItem2);

        groceriesStorage.addItem(groceryItem1);
        groceriesStorage.addItem(groceryItem2);

        furnitureStorage.addItem(furnitureItem1);
        furnitureStorage.addItem(furnitureItem2);

        System.out.println("Electronics in Storage: ");
        WarehouseUtility.displayAllItems(electronicsStorage.getItems());

        System.out.println("Groceries in Storage: ");
        WarehouseUtility.displayAllItems(groceriesStorage.getItems());

        System.out.println("Furniture in Storage: ");
        WarehouseUtility.displayAllItems(furnitureStorage.getItems());

    }
}
