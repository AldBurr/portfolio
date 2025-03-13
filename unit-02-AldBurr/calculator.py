def add(x, y):
    solution = int(x) + int(y)
    return int(x), '+', int(y), "=", (int(x) + int(y))

def subtract(x, y):
    return int(x), "-", int(y), "=", (int(x) - int(y))

def multiply(x, y):
    return int(x), "*", int(y), "=", (int(x) * int(y))

def divide(x, y):
    return int(x), "/", int(y), "=", (float(x) / float(y))

def exponent(x, y):
    return  int(x), "^", int(y), "=", (int(x) ** int(y))
def main():
    inputX = input("Please enter a value for x: ")
    inputY = input("Please enter a value for y: ")
    print(add(inputX, inputY))
    print(subtract(inputX, inputY))
    print(multiply(inputX, inputY))
    print(divide(inputX, inputY))
    print(exponent(inputX, inputY))
main()
