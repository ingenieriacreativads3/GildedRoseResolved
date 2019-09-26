import Item;

public class AgedItem extends Item implements Qualitiable {

    public AgedItem (int sellIn, int quality) {

        super('Aged Brie', sellIn, quality);

    }

    @Override
    public void update() {

        this.getOlder();
        this.increaseQuality();
        
        if(this.sellIn < 0){
            this.increaseQuality();
        }

    }

}