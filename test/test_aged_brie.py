from src.agedBrieItem import AgedBrie
import pytest

@pytest.mark.test_sell_in_zero
def testAgedBrie():
    
    agedBrieItem = AgedBrie("Aged Brie", 0, 35)
    agedBrieItem.updateQuality()

    assert 37 == agedBrieItem.quality
    assert -1 == agedBrieItem.sell_in
    
@pytest.mark.test_sell_in_gt_zero
def test_age_brie():
    
    ageBrieItem = AgedBrie("Aged Brie", 25, 25)  
    ageBrieItem.updateQuality()                         

    assert 26 == ageBrieItem.quality
    assert 24 == ageBrieItem.sell_in

@pytest.mark.testMaxQuality
def test_max_quality():
    
    ageBrieItem = AgedBrie("Aged Brie", 0, 50) 
    ageBrieItem.updateQuality()
    
    assert 50 == ageBrieItem.quality
    assert -1 == ageBrieItem.sell_in
    