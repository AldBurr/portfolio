def boolean_expressions(a, b, c):
    print("A=", a, "B=", b, "C=", c)
    print("A is greater than B:", (a > b))
    print("B is equal to C:", (b == c))
    print("A is less than or equal to C:"(a<= c))
    print("A is not equal to C:", (a != c))
    print("A is greater than B and C:" (a > b and a > c))
    print("B is less than C or A is less than B", (b < c or a < b))
def main():
    boolean_expressions(10, 36, 52)
main()