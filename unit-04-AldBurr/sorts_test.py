import sorts
def test_shift():
    alist = [2, 3, 4, 1, 5]
    target = 3
    expected = [1, 2, 3, 4, 5]
    actual = sorts.shift(alist, target)
    assert actual == expected
def test_insertion_sort():
    alist = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    expected = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    actual = sorts.insertion_sort(alist)
    assert actual == expected
def test_insertion_sort2():
    alist = [1, 7, 3, 4, 10, 6, 2, 8, 9, 5]
    expected = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    actual = sorts.insertion_sort(alist)
    assert actual == expected
def test_insertion_sort():
    alist = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    expected = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    actual = sorts.insertion_sort(alist)
    assert actual == expected
def test_split():
    alist = [1, 2, 3, 4, 5]
    expected = [1, 2], [3, 4, 5]
    actual =  sorts.split(alist)
    assert actual == expected
def test_merge():
    array1 = [1, 6, 8, 14]
    array2 = [3, 9, 10]
    expected = [1, 3, 6, 8, 9, 10, 14]
    actual = sorts.merge(array1, array2)
    assert actual == expected
def test_merge2():
    array1 = [1, 4]
    array2 = [2, 3]
    expected = [1, 2, 3, 4]
    actual = sorts.merge(array1, array2)
    assert actual == expected
def test_merge_sort():
    array = [1, 12, 6, 8, 15]
    expected = [1, 6, 8, 12, 15]
    actual = sorts.merge_sort(array)
    assert actual == expected
def test_quicksort():
    array = [1, 12, 6, 8, 15]
    expected = [1, 6, 8, 12, 15]
    actual = sorts.quicksort(array)
    assert actual == expected