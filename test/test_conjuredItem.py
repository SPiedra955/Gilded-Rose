from src.conjuredItem import *
import pytest

@pytest.mark.test_sell_in_date
def test_sellInDate(): 
    conjuredItem = ConjuredItem("Mana Cake", 10, 5)
    conjuredItem.updateQuality()
    
    assert 9 == conjuredItem.sell_in
    assert 3 == conjuredItem.quality
    
@pytest.mark.test_sell_out_date
def test_sellOutDate():
    conjuredItem = ConjuredItem("Mana cake", 0, 3)
    conjuredItem.updateQuality()
    
    assert -1 == conjuredItem.sell_in
    assert  0 == conjuredItem.quality