def make_myset(length, hash_func=hash):
    return(hash_func, [list() for _ in range(length)])
def add(myset, element):
    hash_func = myset[0]
    table = myset[1]
    hashcode = hash_func(element)
    index = hashcode % len(table)
    chain = table[index]
    for val in chain:
        if element == val:
            return
    chain.append(element)
def contains(myset, element):
    hash_func = myset[0]
    table = myset[0]
    hashcode = hash_func(element)
    index = hashcode % len(table)
    chain = table[index]
    for val in chain:
        if val == element:
            return True
        else:
            return False
def main():
    print(make_myset(7, hash))
    a_set = make_myset(7, hash)
    add(a_set, "One")
main()