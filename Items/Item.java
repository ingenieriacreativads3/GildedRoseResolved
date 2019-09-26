import Qualitiable;

public class Item {

    public String name;
    public int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {

        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;

    }

    @Override
    public String toString() {

        return this.name + ", " + this.sellIn + ", " + this.quality;

    }

    public decreaseQuality() {

        if(this.quality > 0) {
            if(this.sellIn > 0){
                this.quality = this.quality - 1;
            } else {
                this.quality = this.quality - 2;
            }
            
        }

    }

    public increaseQuality() {
        
        if(this.quality < 50) {
            this.quality = this.quality + 1;
        }

    }

    public getOlder() {

        this.sellIn = this.sellIn - 1;

    }

    @Override
    public void update() {
        this.decreaseQuality();
        if(this.sellIn < 0){
            this.decreaseQuality();
        }
    }
}