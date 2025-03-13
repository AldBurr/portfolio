import searches
def test_binary_search():
    a_list = (1, 3, 5, 7, 9, 11, 13)
    target = 11
    start = 0
    end = 6
    expected = 5

    actual = searches.binary_search(a_list, target, start, end)

    assert actual == expected