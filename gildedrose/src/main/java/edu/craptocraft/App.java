package edu.craptocraft;
import java.util.List;
import edu.craptocraft.gildedrose.domain.*;;


public class App {
    public static void main(String[] args) {

        System.out.println("Bienvenido a Ollivanders!");

        GildedRose shop = new GildedRose();

        /**
         * Tedious but necessary, Ollivanders types the 
         * just arrived items and adds them to the 
         * inventory.
         */

        List<Updateable> items = List.of(new NormalItem("+5 Dexterity Vest", 10, 20),
                                         new AgedBrieItem("Aged Brie", 2, 0),
                                         new NormalItem("Elixir of the Mongoose", 5, 7),
                                         new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80),
                                         new SulfurasItem("Sulfuras, Hand of Ragnaros", -1, 80),
                                         new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                                         new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                                         new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 5, 49));
        
        for (Updateable item : items) {
            shop.addItem(item);
        }

        /**
         * Ollivander lists the inventory
         */
        System.out.println("\t ####  DAY 1 ####");
        System.out.println(shop.toString());

        /**
         * One day is gone, inventory updated
         */
        shop.updateQuality();

        /**
         * Ollivander lists the inventory
         */
        System.out.println("\t ####  DAY 2 ####");
        System.out.println(shop.toString());

        /**
         * New item type Conjured just arrived.
         * Add it to the inventory: 
         * polimorphism in action
         */
        shop.addItem(new ConjuredItem("Conjured Mana Cake", 3, 6));
        System.out.println("\t ####  New item conjured added ####");
        System.out.println(shop.toString());

        /**
         * Another day is gone, inventory updated
         */
        shop.updateQuality();
        System.out.println("\t ####  DAY 3 ####");
        System.out.println(shop.toString());
    }
}