import caesar_cipher

def test_decrypt():
    let = 'D'
    expected = 'A'

    actual = caesar_cipher.decrypt_letter(let)

    assert actual == expected
def test_encrypt_message():
    message = 'world'
    expected = 'zruog'

    actual = caesar_cipher.encrypt_message(message)

    assert actual == expected
def test_encrypt_message2():
    message= 'sailing'
    expected = 'vdlolqj'

    actual = caesar_cipher.encrypt_message(message)

    assert actual == expected
def test_decrypt_message():
    message = 'zruog'
    expected = 'world'

    actual = caesar_cipher.decrypt_message(message)

    assert actual == expected
def test_decrypt_message2():
    message= 'vdlolqj'
    expected = 'sailing'

    actual = caesar_cipher.decrypt_message(message)

    assert actual == expected