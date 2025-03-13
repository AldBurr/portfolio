GLOBAL_NUMBER = 12
GLOBAL_NAME = 'Alphinaud'
GLOBAL_DECIMAL = 188.6376

def print_param(parameter):
    print(parameter)

def print_local():
    numberlocal = 867
    print(numberlocal)

def print_which():
    GLOBAL_NUMBER = 'Alden'
    print(GLOBAL_NUMBER)

def main():
    print_param(GLOBAL_NUMBER)
    print_param(GLOBAL_DECIMAL)
    print_param(GLOBAL_NAME)
    numberlocal = 66
    print_local()
    print_which()

main()
