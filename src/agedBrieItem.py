from src.normal_item import *

class AgedBrie(NormalItem):
    
    def __init__(self, name, sell_in, quality):
        Item.__init__(self, name, sell_in, quality)
        
    def setQuality(self, value):
        
        NormalItem.setQuality(self, value)
        
    def updateQuality(self):
        if self.sell_in > 0:
            self.setQuality(1)
        else:
            self.setQuality(2)
        self.setSell_in()