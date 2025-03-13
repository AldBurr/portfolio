"""
minutes_until_midnight.py
"""
def minutes_until_midnight(hour,minutes,meridiem):
    totalmin = minutes
    totalhrs = hour
    if meridiem.lower() =='am':
        extrahrs = 12 - int(hour)
        extrahrs += 12
        totalhrs = int(totalhrs) + int(extrahrs)
    elif meridiem.lower() == 'pm':
        totalhrs = int(totalhrs) + (int(12) - int(hour))
    totalmin = int(totalmin) + (int(totalhrs) * int(60))
    return totalmin

def main():
    hours = input("Please enter current hour: ")
    mins = input("Please enter current minutes: ")
    meridiem = input("Please enter your am or pm: ")
    print("There are", minutes_until_midnight(hours, mins, meridiem), "minutes until midnight")

if __name__ == "__main__":
    main()
