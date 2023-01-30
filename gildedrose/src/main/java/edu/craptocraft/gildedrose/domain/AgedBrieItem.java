package edu.craptocraft.gildedrose.domain;

public class AgedBrieItem extends NormalItem{

    public AgedBrieItem(String name, int sell_in, int quality){
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality(){
        if(getSell_in() > 0){
            computeQuality(1);
        }else{
            computeQuality(2);
        }
        setSell_in();
    }
}
