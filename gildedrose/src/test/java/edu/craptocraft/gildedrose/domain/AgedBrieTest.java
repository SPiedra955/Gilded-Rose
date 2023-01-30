package edu.craptocraft.gildedrose.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgedBrieTest {

    @Test
    public void testAgedBrie() {

        AgedBrieItem cheese = new AgedBrieItem("Aged Brie", 2, 9);
        assertEquals("Aged Brie", cheese.getName());
        assertEquals(2, cheese.getSell_in(), 0);
        assertEquals(9, cheese.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        AgedBrieItem cheese = new AgedBrieItem("Aged Brie", 2, 0);
        System.out.println("toString() Aged Brie test:");
        System.out.println(cheese.toString());
    }

    @Test
    public void updateQualityBrie() {

        AgedBrieItem cheese = new AgedBrieItem("Aged Brie", 2, 0);
        cheese.updateQuality();
        assertEquals(1, cheese.getSell_in(), 0);
        assertEquals(1, cheese.getQuality(), 0);
    }

    @Test
    public void updateQualityBrieExpired() {

        AgedBrieItem cheese = new AgedBrieItem("Aged Brie", 0, 0);
        cheese.updateQuality();
        assertEquals(-1, cheese.getSell_in(), 0);
        assertEquals(2, cheese.getQuality(), 0);    
    }

    @Test
    public void maxQuality() {

        AgedBrieItem brie = new AgedBrieItem("Aged Brie", -1, 50);
        brie.updateQuality();
        assertEquals(-2, brie.getSell_in(), 0);
        assertEquals(50, brie.getQuality(), 0);

        brie = new AgedBrieItem("Aged Brie", -1, 49);
        brie.updateQuality();
        assertEquals(-2, brie.getSell_in(), 0);
        assertEquals(50, brie.getQuality(), 0);
    }
}