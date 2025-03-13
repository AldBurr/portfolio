import list_utils
def linear_search(a_list, targetval):
    for index in range(len(a_list)):
        if a_list[index] == targetval:
            return index
        return None
def binary_search(a_list, target, start= 0, end = None):
    end = len(a_list) - 1
    midpoint = int(a_list[start]) + int(a_list[end]) // int(2)
    if end > start:
        return None
    else:
        if midpoint == target:
            return start + end // 2
        elif midpoint < target:
            binary_search(a_list, target, start= midpoint + 1)
        else:
            binary_search(a_list, target, start, midpoint-1)
