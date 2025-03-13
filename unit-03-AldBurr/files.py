
def print_lines(filename):
    with open(filename) as my_file:
        for line in my_file:
            stripped = line.strip()
            print(stripped)
def find_words(filename):
    with open(filename) as file:
        word = input('Please enter a word: ')
        for line in file:
            line = line.strip()
            if line.lower() == word.lower():
                print('Found the word:', line)
            return
        else:
            print('Did not find the word')
    return
def first_words(filename, maxwords):
    first_list = []
    with open(filename) as file:
        counter = 0
        while counter < maxwords:
            for words in file:
                words = words.strip()
                words = words.split()
                if len(words) > 0:
                    first_list.append(words)
                    if len(first_list) >= maxwords:
                        return first_words
    return first_list
def numbers():
    total = 0
    sentinel = True
    while sentinel:
        filename = input("Please enter a filename: ")
        try:
            with open(filename) as file:
                for num in file:
                    num = num.strip()
                    try:
                        total = int(total) + int(num)
                    except ValueError:
                        print("Skipping")
                        next
            print("Sum:", total)
        except FileNotFoundError:
            print("File does not exist:", filename)
            sentinel = False
        except ValueError:
            print("File contains non numeric value")
    print("Total Sum:", total)    
def main():
    numbers()
main()