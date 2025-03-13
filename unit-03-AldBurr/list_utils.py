import random
def random_list(size, minval = 0, maxval = None):
    a_list = list()
    if maxval == None:
        maxval = size
    counter = 0
    while counter < size:
        a_list.append(random.randint(minval, maxval))
        counter += 1
    return a_list
def range_list(start, stop, step = 1):
    a_range = range(start, stop, step)
    a_list = []
    for vals in a_range:
        a_list.append(vals)
    return a_list