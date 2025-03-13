def bdaymessage():
    name = input("Please enter your name: ")
    birth_month = input("Please enter your birth month: ")
    birth_day = input("Please enter the day that you were born: ")
    birth_year = input("Please enter the year that you were born: ")
    print(name, " your birthday is on ", birth_month, ' ' ,birth_day, ', ', birth_year, sep='')
    
bdaymessage()