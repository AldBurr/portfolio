import practice
def test_absolute_difference():
    firstInt = 5
    secondInt = 2
    expected = 3
    actual = practice.absolute_difference(firstInt, secondInt)
    assert actual == expected
def test_absolute_difference_second():
    intone = 3
    inttwo = 10
    expected = 7
    actual = practice.absolute_difference(intone, inttwo)
    assert actual == expected
def test_absolute_difference_third():
    biggerInt = 30
    smallerInt = 5
    expected = 25
    actual = practice.absolute_difference(biggerInt, smallerInt)
    assert actual == expected
