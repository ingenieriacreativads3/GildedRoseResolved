import Item;
import Qualitiable;

class GildedRose {
    
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality(Qualitiable item) {

        for (int i = 0; i < this.items.length; i++){

            this.items[i].update();

        }

    }
}
