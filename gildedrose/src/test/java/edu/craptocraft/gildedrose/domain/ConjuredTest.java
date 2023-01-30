package edu.craptocraft.gildedrose.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConjuredTest {

    @Test
    public void TestConjured(){
        ConjuredItem cloak = new ConjuredItem("Mana Cake", 15, 18);
        cloak.updateQuality();
        assertEquals(14, cloak.getSell_in(), 0);
        assertEquals(16, cloak.getQuality(), 0);
    }

    @Test
    public void TestConjuredOutDate(){
        ConjuredItem cloak = new ConjuredItem("Mana Cake", 0, 18);
        cloak.updateQuality();
        assertEquals(-1 , cloak.getSell_in(), 0);
        assertEquals(14, cloak.getQuality(), 0);

    }

    @Test
    public void QualityToZero(){
        ConjuredItem cloak = new ConjuredItem("Mana Cake", -4, 16);
        cloak.updateQuality();
        assertEquals(-5, cloak.getSell_in(), 0);
        assertEquals(12, cloak.getQuality(), 0);
    }
}
