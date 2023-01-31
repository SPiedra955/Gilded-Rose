from src.sulfurasItem import *
import pytest

@pytest.mark.test_sulfuras_quality
def test_item_sulfuras():
    
    item = Sulfuras("Hand of Ragnaros", 0, 80)
    item.updateQuality()
    
    assert -1 == item.sell_in
    assert 80 == item.quality
    
@pytest.mark.test_sulfuras_quality
def test_two_sulfuras():
    
    item = Sulfuras("Hand of Ragnaros", 10, 80)
    item.updateQuality()
    
    assert 9 == item.sell_in
    assert 80 == item.quality
