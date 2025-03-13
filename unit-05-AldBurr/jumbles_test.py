import jumbles
def test_list_words():
    filename = "data/words_small.txt"
    expected = ["ate", "eat", "loot", "tea", "tool"]
    actual = jumbles.list_words(filename)
    assert actual == expected
def test_sort_word():
    a_string = "racecar"
    expected = "aaccerr"
    actual = jumbles.sort_word(a_string)
    assert actual == expected
def test_create_dict():
    a_list = ["ate", "eat", "loot", "tea", "tool"]
    expected = {"aet": ["ate", "eat", "tea"], "loot":["loot", "tool"]}
    actual = jumbles.create_dict(a_list)
    assert actual == expected
def test_create_dict():
    a_list = ["ate", "eat", "loot", "tea", "tool"]
    expected = {'aet': ['ate', 'eat', 'tea'], 'loot': ['loot', 'tool']}
    actual = jumbles.create_dict(a_list)
    assert actual == expected