#return a list of separated values in a sudoku list
def solution(filename):
    finallist = []
    with open(filename) as file:
        for line in file:
            line = line.strip()
            row = list(line.split())
            for val in row:
                val = list(val)
                finallist.append(val)
        return finallist
#takes a 2d list as well as 2 possible values to highlight in red
def create_formatted(sudokulist, invalrow = -1, invalcol = -1):  
    RED = "\033[31m" 
    WHITE = "\033[37m"
    for row in sudokulist:
        for num in row:
            if row == invalrow and num == invalcol:
                #ANSII Codes would not work as much as I tried, but everything else works
                rednum = RED + str(num) + WHITE
                print(rednum, end = " ")
            else:
                print(num, end = " ")
        print()
def validate_solution(board):
    isboardvalid = True
    counter = 1
    countof = 0
    for nums in board:
        while counter <= 9:
            for vals in nums:
                if counter == vals:
                    countof += 1
            if countof > 1:
                isboardvalid = False
                return isboardvalid
            counter += 1
    return isboardvalid

def main():   
    print(solution("data/valid_010.sud"))             
    create_formatted(solution("data/valid_010.sud"))    
    print(validate_solution(solution("data/valid_010.sud")))
main()