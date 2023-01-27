from src.normal_item import *

class Sulfuras(NormalItem):
    
    def __init__(self, name, sell_in, quality):
        Item.__init__(name, sell_in, quality)
        
    def updateQuality(self):
        
        assert self.quality == 80, "Quality de %s solo puede ser de 80" % self.__class__.__name__
        pass