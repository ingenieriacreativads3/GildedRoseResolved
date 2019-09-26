import AgedItem;
import BackstageItem;
import SulfurasItem;

public class ItemFactory {

    private final String AGED_BRIE = "Aged Brie";
    private final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    private final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private final String CONJURED = "Conjured Items";

    public Item newItem(String type, int sellIn, int quality){

        switch(type) {
            case this.AGED_BRIE :
                return new AgedItem(sellIn, quality);
                break;
            
            case this.BACKSTAGE :
                return new BackstageItem(sellIn, quality);
                break; 

            case this.SULFURAS :
                return new SulfurasItem(sellIn, quality);
                break; 
            
            default : 
                return null;
            }

    }

}