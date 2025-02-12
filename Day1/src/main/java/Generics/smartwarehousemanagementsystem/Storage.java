package smartwarehousemanagementsystem;
import java.util.*;

//Generic Class Storage
public class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }
}
