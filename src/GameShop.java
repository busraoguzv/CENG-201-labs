import game.inventory.Inventory;
import game.inventory.Item;


public class GameShop {
    public static void main(String[] args) {

        Inventory shop = new Inventory();

        //Create 3 Item objects and add them to the inventory
        Item game1=new Item("Galaxy Racer","Racing",12,"GR-4421");
        Item game2=new Item("Shadow Realm",  "RPG",      5 ,  "SR-8873");
        Item game3=new Item("Pixel Legends", "Strategy", 3 ,"PL-0091");
        shop.addItem(game1);
        shop.addItem(game2);
        shop.addItem(game3);

        //Calling displayAll()
        shop.displayAll();

        System.out.println();

        //Selling some copies:
        //   Sell 4 copies of "Galaxy Racer"
        game1.sell(4);
        //   Sell 6 copies of "Shadow Realm" (should trigger warning — only 5 in stock)
        game2.sell(6);


        System.out.println();

        //Calling displayAll() again to show updated stock
        shop.displayAll();

        System.out.println();

        //Calling auditSerialCodes()
        shop.auditSerialCodes();

        //Try calling getSerialCode() directly from here — it should FAIL to compile.
        // System.out.println(game1.getSerialCode()); // WHY does this fail?
        //getSerialCode() with NO access modifier (package-private)
        //GameShop is not inside the package so it cannot access the method
    }
}