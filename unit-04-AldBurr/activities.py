import random
def tuples(a_tuple):
    print(len(a_tuple))
    print(a_tuple)
    for val in a_tuple:
        print(val)
def scale(a_list, scalar):
    count = 0
    print(a_list)
    while count < len(a_list):
        a_list[count] = a_list[count] * scalar
        count += 1
    print(a_list)
def cat(a_list, b_list):
    c_list = a_list + b_list
    return(c_list)
def extender(a_list, b_list):
    a_list += b_list
    return a_list
def inserter(a_list, val):
    midval = int(len(a_list) // 2)
    a_list.insert(midval, val)
    return a_list
def popper(a_list):
    print(a_list)
    count = len(a_list) - 1
    while count >= 0:
        poppedval = a_list.pop(random.randint(0, count))
        print(poppedval, end=' ')
        print(a_list, end = '\n')
        count -= 1
def tuple_equality(a_tuple, b_tuple):
    val = a_tuple == b_tuple
    print(val)
    val2 = a_tuple is b_tuple
    print(val2)
def swapper(a_list):
    midpoint = len(a_list) // 2
    backlist = a_list[midpoint:]
    frontlist = a_list[:midpoint]
    backlist +=frontlist
    print(backlist)
def comprehension():
    a_list = [Char for Char in "foobar"]
    b_list = [0 for _ in range(15)]
    c_list = [y for y in range(0, 13)]
    d_list = [x for x in range(0, 21) if x % 2 == 0]
    e_list = [z for z in range(51) if z % 5 == 0 or z % 3 == 0]
    print(a_list)
    print(b_list)
    print(c_list)
    print(d_list)
    print(e_list)
def make_table(rows, columns, defval = 0):
    table = [[defval for _ in range(rows)] for _two in range(columns)]
    print(table)
def main():
    a_list = ["a", 12, True]
    b_list = ["a", 12, True]
    a_list_2 = list(range(1, 11))
    #print(inserter(a_list_2, 7))
    #print(inserter(a_list_2, 12))
    #print(inserter(a_list_2, "a?"))
    #popper(a_list)
    #tuple_equality(a_list, b_list)
    #tuple_equality(b_list, a_list_2)
    #swapper(a_list_2)
    #comperhension()
    make_table(3, 3, 4)
main()