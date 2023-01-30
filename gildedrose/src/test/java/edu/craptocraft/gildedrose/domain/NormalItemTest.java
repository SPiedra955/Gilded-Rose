package edu.craptocraft.gildedrose.domain;
import static org.junit.Assert.*;
import org.junit.Test;

public class NormalItemTest {

    @Test
    public void createNormalItem(){
        NormalItem item = new NormalItem("+5 Dexterity Vest", 15, 9);
        assertEquals("+5 Dexterity Vest", item.getName());
        assertEquals(15 , item.getSell_in(), 0);
        assertEquals(9, item.getQuality(), 0);
    }
    
    @Test
    public void toStringTest(){
        NormalItem item = new NormalItem("+5 Dexterity Vest", 15, 9);
        System.out.println(item.toString());
    }

    @Test
    public void updateQualityTest(){
        NormalItem item = new NormalItem("+5 Dexterity Vest", 15, 9);
        item.updateQuality();
        assertEquals(14, item.getSell_in(), 0);
        assertEquals(8, item.getQuality(), 0);        
    }

    @Test
    public void ZeroMinQuality(){
        NormalItem item = new NormalItem("+5 Dexterity Vest", 0, 0);
        item.updateQuality();
        assertEquals(0, item.getSell_in(), 0);
        assertEquals(0, item.getQuality(), 0);     
    }

    @Test
    public void OutDateItem(){
        NormalItem item = new NormalItem("+5 Dexterity Vest", 0, 28);
        item.updateQuality();
        assertEquals(-1, item.getSell_in(), 0);
        assertEquals(26, item.getQuality(), 0);   
    }
}

