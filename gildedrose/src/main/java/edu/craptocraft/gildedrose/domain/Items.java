package edu.craptocraft.gildedrose.domain;

final class Items {
    
    private final String name;
    private int sell_in = 0;
    private int quality = 0;


    Items(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        StringBuilder itemDescription = new StringBuilder();
        itemDescription.append("name=" + getName());
        itemDescription.append(", sell_in=" + getSell_in());
        itemDescription.append(", quality=" + getQuality());
        return itemDescription.toString();
    }

    String getName(){
        return this.name;
    }

    int getSell_in(){
        return this.sell_in;
    }
    void setSell_in(){
        this.sell_in = this.getSell_in() - 1;
    }

    int getQuality(){
        return this.quality;
    }

    void setQuality(int value){
        this.quality = value;
    }
}

