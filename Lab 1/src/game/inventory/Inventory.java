package game.inventory;

/**
 * Manages a collection of Items in the game shop.
 */
public class Inventory {

    private Item[] items; //list
    private int count;

    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    /** Adds an item to the inventory. */
    public void addItem(Item item) {
        //Add item to the array
        if(count<items.length){
            items[count]=item;
            //increment count
            count++;
        }
    }

    /** Displays name, genre, and stock count for every item. */
    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        //Loop through items and print each one's public info
        for(int i=0;i<count;i++){
            System.out.printf("%-13s | %-8s | Stock: %d",items[i].getName(),items[i].getGenre(),items[i].getStockCount());
            System.out.println();
        }
    }

    /**
     * Prints each item's name and serial code.
     * This is allowed because Inventory is in the SAME package as Item,
     * so it can access Item's package-private getSerialCode() method.
     */
    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");
        //Loop through items, call item.getSerialCode() for each
        for(int i=0;i<count;i++){
            System.out.printf("%-13s -> %s",items[i].getName(),items[i].getSerialCode());
            System.out.println();
        }
    }
}