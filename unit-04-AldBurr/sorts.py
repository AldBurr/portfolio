def shift(a_list, index):
    target = a_list[index]
    while a_list[index - 1] > target and index != 0:
        a_list[index] = a_list[index - 1]
        index -= 1
        a_list[index] = target
    return a_list
def insertion_sort(a_list):
    for val in a_list:
        currentindex = a_list.index(val)
        shift(a_list, currentindex)
    return a_list
#Manual Sorting
#10 3 5 6 1 4 8 7
# 10 3 5 6 | 1 4 8 7
# 10 3 | 5 6 | 1 4 | 8 7
# 10 | 3 | 5 | 6 | 1 | 4 | 8 | 7
# 3 10 | 5 6 | 1 4 | 7 8
# 3 5 6 10 | 1 4 7 8
# 1 3 4 5 6 7 8 10
def split(a_list):
    midpoint = len(a_list) // 2
    onelist = a_list[:midpoint]
    twolist = a_list[midpoint:]
    return onelist, twolist
def merge(left, right):
    merged = []
    i1 = 0
    i2 = 0
    while i1 < len(left) and i2 < len(right):
        if left[i1] <= right[i2]:
            merged.append(left[i1])
            i1 = i1 + 1
        else:
            merged.append(right[i2])
            i2 = i2 + 1
    if i1 < len(left):
        merged += (left[i1:])
    else:
        merged += (right[i2:])
    return merged
def merge_sort(a_list):
    if len(a_list) < 2:
        return a_list
    else:
        array1, array2 = split(a_list)
        sortedleft = merge_sort(array1)
        sortedright = merge_sort(array2)
        merged = merge(sortedleft, sortedright)
        return merged
def partition(a_list, pivot):
    less = []
    same = []
    more = []
    for val in a_list:
        if val < pivot:
            less.append(val)
        elif val > pivot:
            more.append(val)
        else:
            same.append(val)
    return less, same, more
def quicksort(a_list):
    if len(a_list) < 2:
        return a_list
    else:
        pivot = a_list[0]
        less, same, more = partition(a_list, pivot)
        sortedless = quicksort(less)
        sortedmore = quicksort(more)
        return sortedless + same + sortedmore




