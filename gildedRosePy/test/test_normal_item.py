from src.normal_item import *
import pytest

@pytest.mark.test_normalItem
def test_items_shop():
    
    normal_item = NormalItem("Elixir of the Mongoose", 5, 10)
    normal_item.updateQuality()
    
    assert 4 == normal_item.sell_in
    assert 9 == normal_item.quality
    
@pytest.mark.test_normalItemTwo
def test_items_shops_two():
    
    normal_item = NormalItem("Elixir of the Mongoose", 0, 10)
    normal_item.updateQuality()
    
    assert -1 == normal_item.sell_in
    assert 8 == normal_item.quality