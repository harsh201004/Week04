package dynamiconlinemarketplace;

public class DynamicOnlineMarketplaceMain {
    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>();
        book.addItems(new BookCategory("rich dad ", 500));
        book.addItems(new BookCategory("poor dad ", 700));

        System.out.println("Book Category: ");
        book.applyDiscount(book.getItems().get(0), 5);
        book.applyDiscount(book.getItems().get(1), 5);
        System.out.println("-----------------------------");

        Product<ClothingCategory> cloth = new Product<>();
        cloth.addItems(new ClothingCategory("T-Shirt", 1200));
        cloth.addItems(new ClothingCategory("jacket ", 4000));

        System.out.println("Cloth Category: ");
        cloth.applyDiscount(cloth.getItems().get(0), 10);
        cloth.applyDiscount(cloth.getItems().get(1), 5);
        System.out.println("-----------------------------");

        Product<GadgetCategory> gadget = new Product<>();
        gadget.addItems(new GadgetCategory("SmartWaych", 1000));
        gadget.addItems(new GadgetCategory("Earbuds", 1200));

        System.out.println("Gadget Category: ");
        gadget.applyDiscount(gadget.getItems().get(0), 5);
        gadget.applyDiscount(gadget.getItems().get(1), 5);


    }

}
