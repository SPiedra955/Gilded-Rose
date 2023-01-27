from src.normal_item import *

class Backstage(NormalItem):
    
    def __init__(self, name, sell_in, quality):
        Item.__init__(name, sell_in, quality)
        
    def updateQuality(self):
        if self.sell_in > 10:
            self.setQuality(1)
        elif self.sell_in > 5:
            self.setQuality(2)
        elif self.sell_in > 0:
            self.setQuality(3)
        else:
            self.setQuality(0)
        self.setSell_in()