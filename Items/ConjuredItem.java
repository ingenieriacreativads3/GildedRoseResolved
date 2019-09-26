import Item;

public class ConjuredItem extends Item implements Qualitiable {

    public ConjuredItem (int sellIn, int quality) {

        super('Conjured Item', sellIn, quality);

    }

    @Override
    public void update() {

        super.update();
        super.update();

    }

}