def variables_practice():
    myAgeMonths = 19 * 12 + 5
    numDaysYear = 365
    nameFirstPet = 'Squeegee'
    firstFivePi = 3.1415
    print('Age in months:', myAgeMonths) 
    print('Number of Days in a Year:',numDaysYear,)
    print('First Pets name:', nameFirstPet)
    print('First five of Pi:', firstFivePi)
def expression_practice():
    additionPracticeVar = 1 + 36
    exponentialVar = 1 ** 9
    modVar = 1 % 7
    floorDevVar = 8 // 3
    print(additionPracticeVar)
    print(exponentialVar)
    print(modVar)
    print(floorDevVar)
def Prompt_and_Print():
    num1 = input("Please enter a number: ")
    num2 = input("Please enter another number: ")
    print('Adding:', float(num1) + float(num2))
    print('Subtracting:', float(num1) - float(num2))
    print('Multiplying:', float(num1) * float(num2))
    print('Dividing:', float(num1) / float(num2))
def main():
    variables_practice()
    expression_practice()
    Prompt_and_Print()
main()
