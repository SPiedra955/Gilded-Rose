package edu.craptocraft.gildedrose.inheritanceTests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import edu.craptocraft.gildedrose.domain.NormalItem;
import edu.craptocraft.gildedrose.domain.AgedBrieItem;
import edu.craptocraft.gildedrose.domain.SulfurasItem;
import edu.craptocraft.gildedrose.domain.GildedRose;


public class heritanceTests {

    @Test
    public void toStringTest() {
        NormalItem object = new NormalItem("+5 Dexterity Vest", 10, 20);
        System.out.println("toString() inheritance test");
        System.out.println(object.toString());
    }

    @Test
    public void updateQualityNormalItem() {

        NormalItem object = new NormalItem("+5 Dexterity Vest", 12, 16);
        object.updateQuality();
        assertEquals("+5 Dexterity Vest", object.getName());
        assertEquals(11, object.getSell_in(), 0);
        assertEquals(15, object.getQuality(), 0);
    }

    @Test
    public void updateQualityOutDateNormalItem() {

        NormalItem object = new NormalItem("+5 Dexterity Vest", 0, 20);
        object.updateQuality();
        assertEquals(-1, object.getSell_in(), 0);
        assertEquals(18, object.getQuality(), 0);    
    }

    @Test
    public void updateQualityUnderZero() {

        NormalItem object = new NormalItem("+5 Dexterity Vest", 10, 0);
        object.updateQuality();
        assertEquals(9, object.getSell_in(), 0);
        assertEquals(0, object.getQuality(), 0);
    }

    @Test
    public void createAgedBrie(){
        AgedBrieItem brie = new AgedBrieItem("Cheese", 15, 8);
        assertEquals("Cheese", brie.getName());
        assertEquals(15, brie.getSell_in(), 0);
        assertEquals(8, brie.getQuality(), 0);
    }

    @Test
    public void updateQualityBrie(){
        AgedBrieItem brie = new AgedBrieItem("Cheese", 15, 8);
        brie.updateQuality();
        assertEquals(14, brie.getSell_in(), 0);
        assertEquals(9, brie.getQuality(), 0);
    }

    @Test
    public void GildedRoseTest(){
        GildedRose shop = new GildedRose();
        NormalItem normal = new NormalItem("Dexterity Vest", 15, 8);
        AgedBrieItem brie = new AgedBrieItem("Cheese", 15, 8);
        SulfurasItem legendary = new SulfurasItem("Cloak", 15, 10);
        shop.addItem(normal);
        shop.addItem(brie);
        shop.addItem(legendary);

        assertEquals(3, shop.inventory().size(), 0);
        // new method
        List<NormalItem> items = List.of(normal, brie, legendary);

        assertArrayEquals(items.toArray(), shop.inventory().toArray());

        System.out.println("GildedRose addItem test: ");
        System.out.println(shop.toString());
    }

    @Test
    public void updateQualityGildedRose(){
        GildedRose shop = new GildedRose();
        NormalItem normal = new NormalItem("Dexterity Vest", 15, 8);
        AgedBrieItem brie = new AgedBrieItem("Cheese", 15, 8);
        shop.addItem(normal);
        shop.addItem(brie);
        assertEquals(2, shop.inventory().size(), 0);
        System.out.println("Day 0: " + '\n' + shop.toString());
        shop.updateQuality();

        NormalItem item = (NormalItem) shop.inventory().get(0);
        assertEquals(7, item.getQuality(), 0);
        assertEquals(9, ((NormalItem) (shop.inventory().get(1))).getQuality(), 0);
        System.out.println("Day 1: " + '\n' + shop.inventory());
    }

}