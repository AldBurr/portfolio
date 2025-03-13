import re
def find_rabbit(filename):
    with open(filename) as file:
        count = 0
        for word in file:
            if re.findall('Rabbit', word):
                count += 1    
            elif re.findall('rabbit', word): 
                count += 1
                if re.findall('rabbits', word):
                    count += 1
            elif re.findall('RABBIT', word):
                count += 1
        return count
def power(base, exponent):
    if (exponent < 0):
        return 'Undefined'
    elif (exponent == 0):
        return 1
    elif (exponent == 1):
        return base
    elif (exponent % 2 != 0):
        return(base * power(base, exponent//2) * power(base, exponent//2))
    elif (exponent % 2 == 0):
        return(power(base, exponent//2) * power(base, exponent//2))
def main():
    print(power(4, 7))
    print(find_rabbit('mini_practicum/data/alice.txt'))
main()