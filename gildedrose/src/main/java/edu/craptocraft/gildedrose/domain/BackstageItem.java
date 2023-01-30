package edu.craptocraft.gildedrose.domain;

public class BackstageItem extends NormalItem{
    public BackstageItem(String name, int sell_in, int quality){
        super(name, sell_in, quality);
    }
    
    @Override
    public void updateQuality(){
        if(getSell_in() > 10){
            computeQuality(1);
        }
        else if(getSell_in() > 5){
            computeQuality(2);
        }
        else if(getSell_in() > 0){
            computeQuality(3);
        }
        else{
            getItem().setQuality(0);
        }
        setSell_in();
    }
}