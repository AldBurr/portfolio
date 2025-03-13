def indexing():
    indexedstring = "Sailboater"
    print('Length:', len(indexedstring))
    print('Fist char:', indexedstring[0])
    print('Last char:', indexedstring[9])
    print('Two Middle chars:', indexedstring[4], indexedstring[5])
    print('First and Last found negatively:', indexedstring[-1], indexedstring[-len(indexedstring)])
def main():
    indexing()
main()