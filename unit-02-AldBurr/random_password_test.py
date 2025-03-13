import random_password
def test_create_ascii_range():
    start = 97
    stop = 100

    expected = 'abc'

    actual = random_password.create_ascii_range_string(start, stop)

    assert actual == expected
def test_create_uppercase_letters_string():
    expected = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

    actual = random_password.create_uppercase_letters_string()

    assert actual == expected
def test_create_lowercase_letters_string():
    expected = 'abcdefghijklmnopqrstuvwxyz'

    actual = random_password.create_lowercase_letters_string()

    assert actual == expected
def test_create_digits_string():
    expected = '0123456789'

    actual = random_password.create_digits_string()

    assert actual == expected
def test_create_symbols_string():
    expected = '!"#$%&\'()*+,-./:;<=>?@{|}~'
    
    actual = random_password.create_symbols_string()

    assert actual == expected
def test_get_random_char_from_string():
    expected = 'a' or 'b' or 'c'

    actual = random_password.get_random_char_from_string('abc')

    assert actual == expected