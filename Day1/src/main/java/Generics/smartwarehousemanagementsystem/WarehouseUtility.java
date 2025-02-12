package smartwarehousemanagementsystem;
import java.util.*;

class WarehouseUtility {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayInfo();
        }
        System.out.println("----------------------------");
    }
}
