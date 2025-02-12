//Test
package dynamiconlinemarketplacetest;

import org.junit.Assert;
import org.junit.Test;
import dynamiconlinemarketplace.*;

public class DynamicOnlineMarketPlaceTest {

        @Test
        public void test1() {
            // Test for BookCategory
            Product<BookCategory> book = new Product<>();
            BookCategory bookCategory = new BookCategory("Rich Dad", 500);
            book.addItems(bookCategory);


            book.applyDiscount(bookCategory, 5);
            Assert.assertEquals(475, bookCategory.getPrice(), 0);
        }

        @Test
        public void test2() {
            // Test for ClothingCategory
            Product<ClothingCategory> cloth = new Product<>();
            ClothingCategory clothingCategory = new ClothingCategory("T-Shirt", 1200);
            cloth.addItems(clothingCategory);

            cloth.applyDiscount(clothingCategory, 10);
            Assert.assertEquals(1080, clothingCategory.getPrice(), 0);
        }

        @Test
        public void test3() {
            // Test for GadgetCategory
            Product<GadgetCategory> gadget = new Product<>();
            GadgetCategory gadgetCategory = new GadgetCategory("Smartphone", 20000);
            gadget.addItems(gadgetCategory);

            gadget.applyDiscount(gadgetCategory, 15);
            Assert.assertEquals(17000, gadgetCategory.getPrice(), 0);
        }
    }

