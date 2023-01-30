package edu.craptocraft.gildedrose.domain;

public class SulfurasItem extends NormalItem {

    public SulfurasItem(String name, int sell_in, int quality){
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {};
}
