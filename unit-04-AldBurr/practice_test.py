import practice
def test_power_odd():
    base = 4
    exponent = 7

    expected = 16384

    actual = practice.power(base, exponent)

    assert actual == expected
def test_power_undefined():
    base = 4
    exponent = -6

    expected = 'Undefined'

    actual = practice.power(base, exponent)
    
    assert actual == expected
def test_power_zero():
    base = 4
    exponent = 0

    expected = 1

    actual = practice.power(base, exponent)
    
    assert actual == expected
def test_power_one():
    base = 4
    exponent = 1

    expected = base

    actual = practice.power(base, exponent)
    
    assert actual == expected
def test_power_even():
    base = 4
    exponent = 2

    expected = 16

    actual = practice.power(base, exponent)
    
    assert actual == expected