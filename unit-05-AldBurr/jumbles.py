def list_words(filename):
    wordlist = list()
    with open(filename) as file:
        for words in file:
            words = words.strip()
            wordlist.append(words.lower())
        return wordlist
def sort_word(a_string):
    a_string = a_string.lower()
    a_list = sorted(a_string)
    sortedstring = ""
    for let in a_list:
        sortedstring += let
    return sortedstring
def create_dict(a_list):
    a_dict = {}
    for val in a_list:
        sortedword = sort_word(val)
        a_dict[sortedword] = []
        for word in a_list:
            if sort_word(word) == sortedword:
                a_dict[sortedword].append(word)
    return a_dict