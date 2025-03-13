CAESARS_CONSTANT = 3
def encrypt_letter(letter, shift = CAESARS_CONSTANT):
    lettercode = ord(letter)
    encryptedletter = int(lettercode) + int(shift)
    encrypted = chr(encryptedletter)
    return encrypted

def is_alphabetic(char):
    if ord(char) >= 41 and ord(char) <= ord('Z'):
        return True
    else:
        return False
def decrypt_letter(letter, shift = CAESARS_CONSTANT):
    letcode = ord(letter)
    decryptedletter = int(letcode) - int(shift)
    decrypt = chr(decryptedletter)
    return decrypt
def encrypt_message(message):
    ciphertext = ""
    for counter in message:
        ciphertext = ciphertext + encrypt_letter(counter)
    return ciphertext
def decrypt_message(message):
    decrypted = ""
    for counter in message:
        decrypted = decrypted + decrypt_letter(counter)
    return decrypted
def main():
    '''lettertoenter = input('Please enter a letter to encrypt: ')'''
    '''amounttoshift = input('Please enter the amount that you would like the letter to be shifted: ')'''
    '''encrypt_letter(lettertoenter, amounttoshift)''' 
    '''encrypt_message("HelloWorld", 3)'''
    '''decrypt_message("KhoorZruog", 3)'''
    multiwordencrypt = input("Please input something with multiple words and a space to be encrypted: ")
    words = multiwordencrypt.split()
    for word in words:
        print(encrypt_message(word), sep="\n")
if __name__ == "__main__":    
    main()