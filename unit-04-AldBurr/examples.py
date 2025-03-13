'''Hello World was printed when I called thre main function'''
'''Time: 0.020426200004294515'''
import time
def use_a_function(value, func):
    return func(value)
def main():
    a = str
    b = use_a_function(123, a)
    x = print
    y = use_a_function("Hello, World!", print)
    start = time.perf_counter()
    sum = 0
    for i in range(1000000):
        sum += i
    end = time.perf_counter()
    elapsed_time = end - start # elapsed time in seconds
    print(elapsed_time)
main()

