def fibonacci_naive(num):
    count = 0
    if num <= 0:
        return 'Undefined'
    elif num == 1:
        return count
    else:
        return count + 1
print(fibonacci_naive(9))