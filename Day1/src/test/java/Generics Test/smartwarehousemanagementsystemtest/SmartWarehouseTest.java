//Test
package smartwarehousemanagementsystemtest;

import org.junit.Assert;
import org.junit.Test;
import smartwarehousemanagementsystem.Electronics;
import smartwarehousemanagementsystem.Furniture;
import smartwarehousemanagementsystem.Groceries;
import smartwarehousemanagementsystem.Storage;

public class SmartWarehouseTest {

    //Test for Electronics
    @Test
    public void test1() {
       Electronics laptop = new Electronics("Laptop", "Dell");
       Storage<Electronics> electronicsStorage = new Storage<>();
       electronicsStorage.addItem(laptop);
       Assert.assertEquals(1, electronicsStorage.getItems().size());

    }

    //Test for Groceries
    @Test
    public void test2() {
        //Test for Groceries
        Groceries apple = new Groceries("Apple", "12-02.2025");
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(apple);
        Assert.assertEquals("Apple", groceriesStorage.getItems().get(0).getName());
    }

    //Test for Furniture
    @Test
    public void test3() {
        Furniture chair = new Furniture("Chair", "Wood");
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(chair);
        Assert.assertEquals("Chair", furnitureStorage.getItems().get(0).getName());
    }
}
