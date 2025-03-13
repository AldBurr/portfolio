def letters():
    letter_list = list()
    count = ord("a")
    while count <= ord("z"):
        letter_list.append(chr(count))
        count += 1
    return letter_list
def make_letter_frequency(filename):
    with open(filename) as file:
        letterlist = letters()
        lettercountdict = {}
        for val in letterlist:
            lettercountdict[val] = 0
        for line in file:
            line = line.strip()
            for word in line:
                lowerletter = word.lower()
                if lowerletter in letterlist:
                    lettercountdict[lowerletter] += 1
        return lettercountdict
def print_letter_frequency(a_dict):
    largest = -1
    letter = ""
    for val in a_dict:
        if a_dict[val] >= largest:
            largest = a_dict[val]
            letter = val
        print(val, ":", a_dict[val])
    print("Most Used Letter ", letter, ": ", largest, sep="")
def main():
    print_letter_frequency(make_letter_frequency("data/alice.txt"))
    print_letter_frequency(make_letter_frequency("data/rit_mission.txt"))
main()