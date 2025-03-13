import sorts
import time
import list_utils
def insertion_sort_function_timer(a_list):
    start = time.perf_counter()
    sorts.insertion_sort(a_list)
    end = time.perf_counter()
    elaps = end - start
    return elaps
def main():
    a_list = list_utils.random_list(3000)
    a_listtwo = list_utils.range_list(0, 3000)
    listhold = list_utils.range_list(0, 3000)
    a_listthree = []
    count = 2999 
    while count >= 0:
        a_listthree.append(listhold[count])
        count -= 1
    print("Random", insertion_sort_function_timer(a_list))
    print("Sorted:", insertion_sort_function_timer(a_listtwo))
    print("Reverese:", insertion_sort_function_timer(a_listthree))
main()