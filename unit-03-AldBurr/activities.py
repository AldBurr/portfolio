import random
def literal_list():
    lista = [1, 16, 'A', 4000, '@@@']
    return lista
def sequence_list(sequence):
    a_list = list(sequence)
    return a_list
def print_list(a_list):
    for item in a_list:
        print(item, end = " ")
def append_to_list(sequence):
    a_list = []
    for counter in sequence:
        a_list.append(counter)
        print(a_list)
    return a_list
def roll_the_die(sides):
    for _ in range(10):
        number = random.randint(1, sides)
        print(number, end=" ")
def countdown(num):
    if num == 0:
        print(num)
        return 0
    else:
        print(num)
        return num + countdown(num-1)
def factorial(n):
    if n == 0  or n == 1:
        return 1
    else:
        return n* factorial(n-1)
def main():
    #print(literal_list())
    #print(sequence_list("1234abc"))
    #print_list(literal_list())
    #print(append_to_list("Hello, World"))
    #num = 0
    #while num < 10:
     #   roll_the_die(20)
      #  num = num + 1
    #print('Sum:', countdown(5))
    print(factorial(10))
main()