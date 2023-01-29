from src.backstageItem import *
import pytest

@pytest.mark.test_backstage_case_one
def test_tenDaysToConcert():
    
    ticket = Backstage("TAFKAL80ETC concert", 11, 20)
    ticket.updateQuality()
    
    assert 10 == ticket.sell_in
    assert 21 == ticket.quality

@pytest.mark.test_backstage_case_two
def test_fiveDaysToConcert():
    ticket = Backstage("TAFKAL80ETC concert", 10, 20)
    ticket.updateQuality()
    
    assert 9 == ticket.sell_in
    assert 22 == ticket.quality

@pytest.mark.test_backstage_case_three
def test_fourDaysToConcert():
    ticket = Backstage("TAFKAL80ETC concert", 5, 20)
    ticket.updateQuality()
    
    assert 4 == ticket.sell_in
    assert 23 == ticket.quality

@pytest.mark.test_backstage_case_four
def test_ticketExpired():
    ticket = Backstage("TAFKAL80ETC concert", 0, 20)
    ticket.updateQuality()
    
    assert -1 == ticket.sell_in
    assert 0 == ticket.quality