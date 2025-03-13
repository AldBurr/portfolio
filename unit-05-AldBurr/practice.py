def gcis_sort(a_list):
    for indA in a_list:
        indB = 0
        while indB < len(a_list) - 1 - indA:
            if a_list[indB] > a_list[indB + 1]:
                hold = a_list[indB]
                a_list[indB] = a_list[indB + 1]
                a_list[indB + 1] = hold
                indB += 1
    return a_list
def place_in_reverse(a_list):
    startind = 0
    length = len(a_list)
    endind = int(length - 1)
    while startind < endind:
        hold = a_list.pop(startind)
        hold2 = a_list.pop(endind - 1)
        a_list.insert(startind, hold2)
        a_list.insert(endind, hold)
        startind = startind + 1
        endind = endind - 1
    return a_list
def make_multiplication_table():
    rows = 10
    cols = 10
    table = [[0]*rows]*cols
    incermenter = 1
    multiplyby = 1
    for row in range(rows):
        
        for col in range(cols):
            table[row][col] = (incermenter) - 90
            incermenter += 1
    return table
def main():
    #a_list = [1, 2, 3, 4, 5, 6, 7]
    #print(a_list)
    #print(place_in_reverse(a_list))
    print(make_multiplication_table())
main()