"""
The Program organizes the prints into functions to simplify them
Alden Burt
"""
def helloworld():
    """
    This function creates the normal first program into a function
    """
    '''This Initializes the function with its name'''
    print('Hello, World!')
    '''This prints the words once the function is called'''
def hello():
    """
    This function creates a function that gives a personalized greeting after requesting their name
    """
    '''This again initializes a second function'''
    my_name = input("Please Enter Your Name: ")
    '''This requests an input to name a variable'''
    print("Hello,", my_name)
    '''This then prints a more personalized greeting with the name'''
helloworld()
hello()
'''These two call the two different functions to get them to print'''