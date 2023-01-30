package edu.craptocraft.gildedrose.domain;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemsTest {

    @Test
    public void createItem() {
        Items article = new Items("+5 Dexterity Vest", 19, 9);

        assertEquals("+5 Dexterity Vest", article.getName());
        assertEquals(19, article.getSell_in(), 0);
        assertEquals(9, article.getQuality(), 0);
        System.out.println(article);
    }
    
}
