import re
import random
def create_acronym(word):
    splitword = word.split()
    finalac = ""
    for usedword in splitword:
        letterfind = list(usedword)
        finalac = finalac + letterfind[0]
    return finalac
def harmonic_sum(n):
    finalval = 0.0
    counter = 1
    while counter <= n:
        finalval = float(finalval) + float(float(1) / float(counter))
        counter += 1
    return finalval
def divisible_or_not(a_list, target, divisible = True):
    returnlist = []
    for num in a_list:
        if divisible == True:
            if float(num) % float(target) == 0:
                returnlist.append(num)
        elif divisible == False:
            if float(num) % float(target) != 0:
                returnlist.append(num)
    return returnlist 
def recursive(val):
    if val == 1:
        return val
    elif val % 2 == 0:
        return val + recursive(val / 2)
    elif val % 2 != 0:
        return val + recursive(val + 1)
    elif val < 1:
        return "Undefined"
def linear_search_rec(a_list, target, ind):
    if a_list[ind] == target:
        return ind
    else:
        ind += 1
        return linear_search_rec(a_list, target, ind)
def shuffle(a_list):
    random.seed(1)
    for count in range(len(a_list)-1, 0, -1):
        randval = random.randint(0, count)
        hold = a_list[count]
        a_list[count] = a_list[randval]
        a_list[randval] = hold
    return a_list
def random_search(a_list, target):
    lengthA = len(a_list)
    indexlist = shuffle(list(range(0, lengthA)))
    for count in indexlist:
        if a_list[count] == target:
            return count
        else:
            return None


def main():
    #print(create_acronym('Golisano College of Computing and Information Science'))
    #print(harmonic_sum(3))
    #print(divisible_or_not((2, 4, 6, 8, 10, 12, 14, 16), 4, False))
    #print(recursive(101))
    #print(linear_search_rec(['A', 'B', 'C', 'D'], 'C', 0))
    #shuffle([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
    print(random_search([0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20], 7))
main()
