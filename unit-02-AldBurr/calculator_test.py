import calculator

def test_add():
    x = 5
    y = 7
    expected = (5, '+', 7, '=', 12)

    actual = calculator.add(x, y)

    assert actual == expected

def test_subtract():
    x = 4
    y = 8
    expected = (4, '-', 8, '=', -4)

    actual = calculator.subtract(x, y)

    assert actual == expected

def test_multiply():
    x = 3
    y = 9
    expected = (3, '*', 9, '=', 27)

    actual = calculator.multiply(x, y)

    assert actual == expected

def test_divide():
    x = 12
    y = 6
    expected = (12, '/', 6, '=', 2.0)

    actual = calculator.divide(x, y)

    assert actual == expected

def test_exponent():
    x = 10
    y = 4
    expected = (10, '^', 4, '=', 10000)

    actual = calculator.exponent(x, y)

    assert actual == expected
