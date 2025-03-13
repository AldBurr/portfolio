from random import *
def create_ascii_range_string(startInt, stopInt):
    a_range = range(int(startInt), int(stopInt))
    finalstring = ''
    for printer in a_range:
        finalstring = finalstring + str(chr(printer))
    return finalstring
def create_uppercase_letters_string():
    uppercaseletters = ''
    uppercaserange = create_ascii_range_string(ord('A'), int(ord('Z')) + int(1))
    for counter in uppercaserange:
        uppercaseletters = uppercaseletters + counter
    return uppercaseletters
def create_lowercase_letters_string():
    lowercaseletters = ''
    lowercaserange = create_ascii_range_string(ord('a'), int(ord('z')) + int(1))
    for counter in lowercaserange:
        lowercaseletters = lowercaseletters + counter
    return lowercaseletters
def create_digits_string():
    digits = ''
    digitrange = create_ascii_range_string(ord('0'), int(ord('9') + int(1)))
    for counter in digitrange:
        digits = digits + counter
    return digits
def create_symbols_string():
    symbols = ''
    symbolsrange = create_ascii_range_string(ord('!'), int(ord('/')) + int(1))
    for counter in symbolsrange:
        symbols = symbols + counter
    symbolsrange2 = create_ascii_range_string(ord(':'), int(ord('@')) + int(1))
    for count in symbolsrange2:
        symbols = symbols + count
    symbolsrange3 = create_ascii_range_string(ord('['), int(ord('\'')) + int(1))
    for count in symbolsrange3:
        symbols = symbols + count
    symbolsrange4 = create_ascii_range_string(ord('{'), int(ord('~')) + int(1))
    for count in symbolsrange4:
        symbols = symbols + count
    return symbols
def get_random_char_from_string(input):
    returned = ''
    returned = input[randint(0, 2)]
    return returned
def get_random_password(numUpper, numLow, numdig, numsymb):
    finalpassword = ''
    upperstring = create_uppercase_letters_string()
    lowerstring = create_lowercase_letters_string()
    digstring = create_digits_string()
    symbstring = create_symbols_string()
    totallength = int(numUpper) + int(numLow) + int(numdig) + int(numsymb)
    counter = 0
    while counter < totallength:
        selector = randint(1, 4)
        if selector == 1:
            finalpassword = finalpassword + get_random_char_from_string(upperstring)
        elif selector == 2:
            finalpassword = finalpassword + get_random_char_from_string(lowerstring)
        elif selector == 3:
            finalpassword = finalpassword + get_random_char_from_string(digstring)
        elif selector ==4:
            finalpassword = finalpassword + get_random_char_from_string(symbstring)
        counter = counter + 1
    print("Password:", finalpassword)
def main():
    fullintset = input('Please enter 4 integers with a space in between: ')
    separated = fullintset.split()
    numup = int(separated[0])
    numlow = int(separated[1])
    numdig = int(separated[2])
    numsym = int(separated[3])
    fulllength = 0
    for counter in separated:
        fulllength = int(fulllength) + int(counter)
    if fullintset == "":
        exit
    elif len(separated) > 4 or len(separated) < 4:
        print('Please enter only 4 numbers')
    get_random_password(numup, numlow, numdig, numsym)
main()
