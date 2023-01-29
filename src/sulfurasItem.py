from src.normal_item import *

class Sulfuras(NormalItem):
    
    def __init__(self, name, sell_in, quality):
        Item.__init__(self, name, sell_in, quality)
        
    def updateQuality(self):
        assert self.quality == 80, "quality de %s distinta de 80" % self.__class__.__name__
        pass
        self.setSell_in()