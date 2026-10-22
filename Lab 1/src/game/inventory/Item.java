package game.inventory;

/**
 * Represents a single game title available in the shop.
 * Access modifiers are chosen to enforce least privilege.
 */
public class Item {

    //fields with appropriate access modifiers
    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;


    public Item(String name, String genre, int stockCount, String serialCode) {
        //Initializing all fields
        this.name= name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    //Public getters for name, genre, stockCount only
    public String getName() {return name;}
    public String getGenre() {return genre;}
    public int getStockCount() {return stockCount;}

    /**
     * Package-private: accessible within game.inventory, hidden from outside.
     * Used by Inventory for auditing purposes.
     */
    //getSerialCode() with NO access modifier (package-private)
    String getSerialCode() {return serialCode;}


    /**
     * Private helper: checks whether enough stock exists.
     */
    private boolean isAvailable(int quantity) {
        //Return true if stockCount >= quantity
        if(stockCount >= quantity) {
            return true;
        }
        return false;
    }

    //Reduces stock by the given quantity if available.
    public void sell(int quantity) {
        //Use isAvailable() to check stock before selling
        if(isAvailable(quantity)){
            //If available: reduce stockCount, print confirmation
            stockCount-=quantity;
            System.out.println("Sold "+quantity+" copy/copies of "+name+". Remaining stock: "+stockCount);

        }else{
            //printing warning message, not change the stockCount
            System.out.println("WARNING: Not enough stock for "+name+". Requested: "+quantity+", Available: "+stockCount);
        }
    }
}
