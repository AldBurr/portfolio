ONE_HUNDRED_OF_PI = range(31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679)
def absolute_difference(intX, intY):
    if int(intX) > int(intY):
        return int(intX) - int(intY)
    elif int(intX) < int(intY):
        return int(intY) - int(intX)
def pi_tester():
    score = 0
    for counter in ONE_HUNDRED_OF_PI:
        digit = input('Please enter the next digit: ')
        if digit == counter:
            score = score + 1
        else:
            return score
    return score
def main():
    print('Score:', pi_tester())
main()

