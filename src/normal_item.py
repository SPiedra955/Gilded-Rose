from src.interface import *
from src.item import *

class NormalItem(Interface, Item):
    
    def __init__(self, name, sell_in, quality):
        Item.__init__(self, name, sell_in, quality)
    
    def setSell_in(self):
        self.sell_in = self.sell_in - 1
        
    def setQuality(self, value):
        
        if self.quality + value > 50:
            self.quality = 50
        
        elif self.quality + value >= 0:
            self.quality = self.quality + value
            
        else:
            self.quality = 0
            
    def updateQuality(self):
        if self.sell_in > 0:
            self.setQuality(-1)
        else:
            self.setQuality(-2)
        self.setSell_in()
        
    