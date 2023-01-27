class GildedRose(object):
    
    def __init__(self, items):
        self.items = items
        
    def updateQuality(self):
        for item in self.items:
            item.updateQuality()
            
