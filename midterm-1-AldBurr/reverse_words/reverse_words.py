"""
word_reverse.py

"""

def reverse_words(a_sentence):
    wordlist = a_sentence.split()
    reversedlist = "" 
    counter = len(wordlist) - 1
    while counter >= 0:
        reversedlist += wordlist[counter]
        reversedlist += " "
        counter -= 1
    return reversedlist

def main():
    reverse_words("Hello World")

main()