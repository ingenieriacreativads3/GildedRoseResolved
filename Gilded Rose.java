import Item;
import Qualitiable;

class GildedRose {
    
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (QualityUpdatable item : this.items) {
            item.update();
        }
    }
}
