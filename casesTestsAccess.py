def accessTestCasesInText(multiArray, pathAccessFile):
    
    try:
        if type(pathAccessFile) != str:
            raise ValueError
        file = open(pathAccessFile, 'r')
    
    except ValueError:
        return []
    
    else:
        multiArray = []
        for line in file:
            if line.find("day") != -1:
                txtIntoArray = []
            elif line == "\n":
                multiArray.append(txtIntoArray)
            elif line.find("name") != -1:
                contentIndexes = len(line.split(','))
            else:
                item = line.rstrip().rsplit(',', maxsplit=contentIndexes-1)
                txtIntoArray.append(item)
        file.close()
        return multiArray
    
def createFolderCasesText(file, multiArray):
    
    try:
        if type(file) != str:
            raise ValueError
        file = open(file, 'w')
    except ValueError:
        print("The path must be a string")
    else:
        for(offset, txtIntoArray) in enumerate(multiArray):
            file.write('#' * 5 + " Day %d: " % offset + '#' * 5 + '\n')
            for item in txtIntoArray:
                file.write(','.join(item) + '\n')
        file.close()

def showTestCases(multiArray):
    
    for(offset, txtIntoArray) in enumerate(multiArray):
        print('#' * 5 + " Dia %d: " % offset + '#' * 5)
        for item in txtIntoArray:
            print(item)

if __name__ == "__main__":
    
    pathAccesFile = "./test.txt"
    
    multiArray = []
    
    multiArray = accessTestCasesInText(multiArray, pathAccesFile)

    showTestCases(multiArray)
    
    file = "./itemsToArrays.txt"
    
    createFolderCasesText(file, multiArray) 