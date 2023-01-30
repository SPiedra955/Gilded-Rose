package edu.craptocraft.gildedrose.heritanceTests;

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
    public void updateQuality() {

        NormalItem object = new NormalItem("+5 Dexterity Vest", 10, 20);
        object.updateQuality();
        assertEquals("+5 Dexterity Vest", object.getName());
        assertEquals(9, object.getSell_in(), 0);
        assertEquals(19, object.getQuality(), 0);
    }

    @Test
    public void updateQualityOutDate() {

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

}