GLOBAL_A_CODE = 65
def convert_to_ascii(a):
    converted_code = ord(a)
    print(converted_code)

def convert_from_ascii(b):
    converted_letter = chr(b)
    print(converted_letter)

def alphabet_position(letter, GLOBAL_A_CODE):
    convert_letter = ord(letter)
    print(letter, 'is in position', (int(convert_letter) - int(GLOBAL_A_CODE) + 1), 'in the alphabet')

def main():
    convert_to_ascii("Q")
    convert_from_ascii(122)
    alphabet_position("Z", GLOBAL_A_CODE)
    alphabet_position("H", 400)
    alphabet_position("A", -260)
main()