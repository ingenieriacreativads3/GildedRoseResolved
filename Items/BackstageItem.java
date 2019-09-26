import Item;

public class BakcstageItem extends Item implements Qualitiable {

    public BakcstageItem (int sellIn, int quality) {

        super('Backstage passes to a TAFKAL80ETC concert', sellIn, quality);

    }

    @Override
    public void update() {

        this.getOlder();
        this.increaseQuality();

        if(this.quality < 11){
            this.increaseQuality();
        }

        if(this.quality < 6){
            this.increaseQuality();
        }

        if(this.sellIn < 0){
            this.quality = this.quality - this.quality;
        }
        

    }

}