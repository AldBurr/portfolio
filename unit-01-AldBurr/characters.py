def add_chars(num1, num2):
    finalasciicode = (int(num1) + int(num2))
    finalasciiletter = chr(finalasciicode)
    print('Total ASCII Code is:', finalasciicode, 'and the letter/symbol is:', finalasciiletter)

def sub_chars(asciicode1, asciicode2):
    subtractedcode = (int(asciicode1) - int(asciicode2))
    subtractedletter = chr(subtractedcode)
    print('Subtracted ASCII Code is:', subtractedcode, 'and the letter/symbol is:', subtractedletter)

def main():
    inputedcode1 = input('Please enter a number: ')
    inputedcode2 = input('Please enter another number: ')
    add_chars(inputedcode1, inputedcode2)
    sub_chars(inputedcode1, inputedcode2)
main()
"""
The first function ran without error after the values were input
The second function did not run an gave an error saying out of bounds because of the subtraction
No strange characters were shown
"""