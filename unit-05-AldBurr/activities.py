import timing
import random
import math
def square(x):
    return x ** 2
def double(x):
    return x * 2
def negate(x):
    return -x
def apply_transformation(a_list, funcparam):
    copylist = []
    for val in a_list:
        copylist.append(funcparam(val))
    return copylist
def unique_list(a_list, value):
    for vals in a_list:
        if vals == value:
            return
        a_list.append(value)
    return a_list
def fill_list(length):
    a_list = []
    for i in range(length):
        unique_list(a_list, i)
    return a_list
def sets():
    a_set = {1, 2, 3}
    a_set.add(4)
    a_set.add(5)
    b_set = set("Hello World")
    print(a_set)
    print(b_set)
def unique_set(a_set, val):
    if val not in a_set:
        a_set.add(val)
def fill_set(length):
    a_set = set()
    for i in range(length):
        unique_set(a_set, i)
def coupon_collector(n):
    expected = (n * math.log(n)) + (0.57721566 * n)
    coupons = set()
    count = 0
    while len(coupons) < n:
        coupon = random.randint(1, n)
        coupons.add(coupon)
        count += 1
    return expected, count
def mixup():
    a_set = ("Crazy, I was crazy Once")
    for nums in a_set:
        print(nums, end=" ")
    print()
def unique_words(filename):
    unique_words = set()
    with open(filename) as file:
        for line in file:
            words = line.split()
            for word in words:
                unique_words.add(word.lower())
        return unique_words
def superset(a_set, b_set):
    if b_set in a_set:
        return True
    else:
        return False
def names():
    a_dict = {}
    a_dict["A"] = "Alden"
    a_dict["T"] = "Thomas"
    a_dict["B"] = "Burt"
    a_dict["E"] = "Ethan"
    a_dict["E"] = "Everett"
    a_dict["B"] = "Burt"
    a_dict["J"] = "Jonathan"
    a_dict["E"] = "Everett"
    a_dict["B"] = "Burt"
    if "A" in a_dict:
        print(a_dict["A"])
def print_dict(a_dict):
    for val in a_dict:
        value = a_dict[val]
        print(val, ":", value)
def find_maximum(a_dict):
    greatest = 0
    greatkey = ""
    for val in a_dict:
        value = a_dict[val]
        if value > greatest:
            greatest = value
            greatkey = val
    return greatest, greatkey
def countwords(filename):
    worddict = {}
    with open(filename) as file:
        for words in file:
            line = words.split()
            for word in line:
                word = word.lower()
                if word not in worddict:
                    worddict[word] = 0
                worddict[word] += 1
        return worddict
def hashes():
    print(hash("Hello World"))
    print(hash("Hello world"))
    print(hash("A"*1000000))
    print(hash("A"*1000000000))
def collisions(filename, length, hash_func=hash):
    count = 0
    a_list = [None for _ in range(length)]
    with open(filename) as file:
        for line in file:
            line = line.strip()
            if len(line) > 0:
                code = hash_func(line)
                index = code % length
                if a_list[index] is None:
                    a_list[index] = line
                    count +=1
                else:
                    return count
def ascii_codes(a_string):
    a_string = list(a_string)
    for letters in a_string:
        print(letters, ": ", ord(letters), sep="")
def string_hash(a_string):
    largest = -1
    a_list = a_string
    for val in a_list:
        if ord(val) >= largest:
            largest = ord(val)
    return largest*len(a_string)
def main():
    #a_list = list(range(1, 10))
    #print(apply_transformation(a_list, square))
    #print(apply_transformation(a_list, double))
    #print(apply_transformation(a_list, negate))
    #print(unique_list(a_list, 5))
    #sets()
    #mixup()
    #unique_words("data/alice.txt")
    #names()
    #diction = {"jahn":1, "Ahyep":2}
    #print_dict(diction)
    #print(countwords("data/alice.txt"))
    #print(collisions("data/alice.txt", 1000))
    #hashes()
    #ascii_codes("GCIS-127")
    print(string_hash("GCIS-127"))
    print(string_hash("ARG"))
    print(collisions("data/alice.txt", 10000, string_hash))
main()
