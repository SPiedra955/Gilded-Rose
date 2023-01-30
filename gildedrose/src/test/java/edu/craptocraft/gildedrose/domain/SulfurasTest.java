package edu.craptocraft.gildedrose.domain;
import static org.junit.Assert.*;
import org.junit.Test;

public class SulfurasTest {

    @Test
    public void createItem() {

        SulfurasItem Sulfuras  = new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80);
        assertEquals("Sulfuras, Hand of Ragnaros", Sulfuras.getName());
        assertEquals(0, Sulfuras.getSell_in(), 0);
        assertEquals(80, Sulfuras.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        SulfurasItem Sulfuras = new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80);
        System.out.println("Sulfuras toString() test");
        System.out.println(Sulfuras.toString());
    }

    @Test
    public void updateQualitySulfuras() {

        SulfurasItem Sulfuras = new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80);
        Sulfuras.updateQuality();
        assertEquals(0, Sulfuras.getSell_in(), 0);
        assertEquals(80, Sulfuras.getQuality(), 0);
    }
}