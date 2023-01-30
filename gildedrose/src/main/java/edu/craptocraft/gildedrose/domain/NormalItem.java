package edu.craptocraft.gildedrose.domain;


public class NormalItem implements Updateable {

    private final Items item;

    public NormalItem(String name, int sell_in, int quality) {
        this.item = new Items(name, sell_in, quality);
    }

    @Override
    public String toString() {
        return item.toString();
    }

  
    Items getItem() {
        return this.item;
    }

    public String getName() {
        return item.getName();
    }

    public int getSell_in() {
        return item.getSell_in();
    }

    void setSell_in() {
        item.setSell_in();
    }

    public int getQuality() {
        return item.getQuality();
    }

    void computeQuality(int value) {

        if (getQuality() + value > 50) {
            item.setQuality(50);
        }
        else if (getQuality() + value >= 0) {
            item.setQuality(getQuality() + value);
        }
        else {
            item.setQuality(0);
        }
    }

    @Override
    public void updateQuality() {

        if (getSell_in() > 0) {
            computeQuality(-1);
        } else {
            computeQuality(-2);
        }
        setSell_in();
    }
}
