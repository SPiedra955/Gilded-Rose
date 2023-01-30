package edu.craptocraft.gildedrose.domain;

import static org.junit.Assert.*;

import org.junit.Test;


public class BackstageTest {
    @Test
    public void BackstageTicket(){
        BackstageItem ticket = new BackstageItem("ticket", 15, 20);
        assertEquals("ticket", ticket.getName());
        assertEquals(15, ticket.getSell_in(), 0);
        assertEquals(20, ticket.getQuality(), 0);
    }

    @Test
    public void toStringTest(){
        BackstageItem ticket = new BackstageItem("ticket", 15, 20);
        System.out.println("toString() BackstageTest");
        System.out.println(ticket.toString());
    }

    @Test
    public void OverTenDaysToConcert(){
        BackstageItem ticket = new BackstageItem("ticket", 14, 25);
        ticket.updateQuality();
        assertEquals(13, ticket.getSell_in(), 0);
        assertEquals(26, ticket.getQuality(), 0);
    }

    @Test
    public void OverFiveDaysToConcert(){
        BackstageItem ticket = new BackstageItem("ticket", 7, 25);
        ticket.updateQuality();
        assertEquals(6, ticket.getSell_in(), 0);
        assertEquals(27, ticket.getQuality(), 0);
    }

    @Test
    public void OverZeroDaysToConcert(){
        BackstageItem ticket = new BackstageItem("ticket", 4, 18);
        ticket.updateQuality();
        assertEquals(3, ticket.getSell_in(), 0);
        assertEquals(21, ticket.getQuality(), 0);
    }

    @Test
    public void TicketExpired(){
        BackstageItem ticket = new BackstageItem("ticket", 0, 18);
        ticket.updateQuality();
        assertEquals(-1, ticket.getSell_in(), 0);
        assertEquals(0, ticket.getQuality(), 0);
    }

    @Test
    public void maxQuality(){
        BackstageItem ticket = new BackstageItem("item", 15, 50);
        ticket.updateQuality();;
        assertEquals(14, ticket.getSell_in(), 0);
        assertEquals(50, ticket.getQuality(), 0);
    }
}
