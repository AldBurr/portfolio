def convert_height(heightinch):
    heightfeet = int(int(heightinch) / int(12))
    heightleftover = int(int(heightinch) % int(12))
    print("Your height is: ", heightfeet, "\' ", heightleftover, "\" ", sep = "")
def before(letter):
    lettercode = ord(letter)
    print(letter)
    print(chr(int(lettercode) - int(1)))
    print(chr(int(lettercode) - int(2)))
    print(chr(int(lettercode) - int(3)))
def main():
    heightinches = input('Please enter your height in inches: ')
    convert_height(heightinches)
    inputletter = input('Please enter a letter: ')
    before(inputletter)
main()